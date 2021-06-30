package DI08;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Student student1() {

		ArrayList<String> hobbys = new ArrayList<String>();
		Student student1 = new Student("을지문덕", 55, hobbys);
		hobbys.add("수영");
		hobbys.add("물내리기");
		student1.setHeight(170);
		student1.setWeight(68);
		return student1;
	}
}
