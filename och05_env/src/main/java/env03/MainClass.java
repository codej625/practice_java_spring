package env03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("1. Run");

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		System.out.println("4. adminConfig Before Run");

		AdminConnection connection = ctx.getBean("adminConfig", AdminConnection.class);

		System.out.println("5. adminConfig After Run");

		System.out.println("connection.getAdminID adminID : " + connection.getAdminID());
		System.out.println("connection.getAdminPW adminPW : " + connection.getAdminPW());
		System.out.println("connection.getSub_adminID() sub_adminID : " + connection.getSub_adminID());
		System.out.println("connection.getSub_adminPW() sub_adminPW : " + connection.getSub_adminPW());

		ctx.close();
	}

}
