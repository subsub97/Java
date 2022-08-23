import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 커맨드 + 쉬프트 + O 를 이용하여 import 추가 가
	Scanner scan = new Scanner(System.in); 
	System.out.println("총 몇명의 학생이 존재합니까??");
	int number = scan.nextInt();
	
	Student[] students = new Student[number];
	
	for(int i = 0 ; i < number; i++) {
		String name;
		int age;
		int weight;
		int height;
		String studentID;
		int grade;
		double gPA;
		System.out.println("학생 이름을 입력하세요!");
		name = scan.next();
		System.out.println("학생 나이를 입력하세요!");
		age = scan.nextInt();
		System.out.println("학생 키를 입력하세요!");
		height = scan.nextInt();
		System.out.println("학생 몸무게를 입력하세요!");
		weight = scan.nextInt();
		System.out.println("학생 학번을 입력하세요!");
		studentID = scan.next();
		System.out.println("학생 성적을 입력하세요!");
		grade = scan.nextInt();
		System.out.println("학생 학점을 입력하세요!");
		gPA = scan.nextDouble();
		students[i]= new Student(name,age,weight,height,studentID,grade,gPA) ;
	}
	for(int j =0 ;j < number; j++) {
		students[j].show();
	}
		
	
		
	}

}
