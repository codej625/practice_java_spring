package  DI03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	
		String configLocation = "classpath:applicationCTX3.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
//		Student student1 = new Student("연개소문", 50, "4학년", "25번");
//		student1.setName("양만춘");
//		StudentInfo studentInfo = new StudentInfo(student1);
		studentInfo.getStudentInfo();
		
		
		
		
		
		Student student2 = ctx.getBean("student2", Student.class);
//		Student student2 = new Student("김유신", 30, "3학년", "5번");
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
		
		System.out.println("student2.getAge()-->"+student2.getAge());
		System.out.println(student2.getAge()+5);
		
		ctx.close();
		}
}
