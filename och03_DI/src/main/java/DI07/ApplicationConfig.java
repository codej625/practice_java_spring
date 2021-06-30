package DI07;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		Student student1 = new Student("안예은", 24, hobbys);
		hobbys.add("팝뮤직");
		hobbys.add("피아노");
		student1.setHeight(160);
		student1.setWeight(50);
		return student1;
	}

	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		Student student2 = new Student("김준수", 22, hobbys);
		hobbys.add("뮤지컬");
		hobbys.add("음악감상");
		student2.setHeight(178);
		student2.setWeight(76);
		return student2;
	}
}
