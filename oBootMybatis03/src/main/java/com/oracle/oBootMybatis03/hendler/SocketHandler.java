package com.oracle.oBootMybatis03.hendler;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SocketHandler extends TextWebSocketHandler {
	HashMap<String, WebSocketSession> sessionMap = new HashMap<>(); // 웹소켓 세션을 담아둘 맵

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message) {
		// 메세지 발송
		String msg = message.getPayload();
		System.out.println("SoketHandler handleTextMessage msg->" + msg);
		JSONObject jsonObj = jsonToObjectParser(msg);
		for (String key : sessionMap.keySet()) {
			WebSocketSession wss = sessionMap.get(key);
			try {
				wss.sendMessage(new TextMessage(jsonObj.toJSONString()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("SocketHandler afterConnectionEstablished start...");
		// 웹소켓 연결이 되면 동작
		super.afterConnectionEstablished(session);
		sessionMap.put(session.getId(), session);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("type", "getId");
		jsonObj.put("sessionId", session.getId());
		session.sendMessage(new TextMessage(jsonObj.toJSONString()));

	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("SocketHandler afterConnectionEstablished start...");
		// 웹소켓 종료
		sessionMap.remove(session.getId());
		super.afterConnectionClosed(session, status);
	}

	// handleTextMessage 메소드에 JSON파일이 들어오면 파싱해주는 함수를 추가
	private JSONObject jsonToObjectParser(String jsonStr) {
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = null;
		try {
			jsonObj = (JSONObject) parser.parse(jsonStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObj;
	}

}
