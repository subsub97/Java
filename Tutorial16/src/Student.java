
public class Student extends Person{
	
	private String studentID;
	private int grade;
	private double GPA;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	// 편의성을 위해 상속받아온 name, age etc...를 생성자에 포함되어 있다.
	public Student(String name, int age, int weight, int height, String studentID, int grade, double gPA) {
		super(name, age, weight, height);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	//출력을 위한 메소드 추가
	public void show() {
		System.out.println("----------------------------");
		System.out.println("학생 이름 : " + getName());
		System.out.println("학생 나이 : " + getAge());
		System.out.println("학생 몸무게 : " + getWeight());
		System.out.println("학생 키 : " + getHeight());
		System.out.println("학생 학번 : " + getStudentID());
		System.out.println("학생 성적 : " + getGrade());
		System.out.println("학생 학점 : " + getGPA());
	}
	

}
