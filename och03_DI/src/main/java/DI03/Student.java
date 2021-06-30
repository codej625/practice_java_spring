package DI03;

public class Student {

	// Member Variable
	private String name;
	private int age;
	private String gradeNum;
	private String classNum;

	// Constructor
	public Student(String name, int age, String gradeNum, String classNum) {
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNum = classNum;
	}

	// Getter and Setter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGradeNum() {
		return gradeNum;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

}
