// 자바에서 Scanner를 사용하기 위해서는 꼭 import 해줘야 한다.

import java.util.Scanner;

// 배열을 실습해보자!!
// 숫자들을 입력 받아서 가장 큰 수를 뽑아낼수있는 배열을 생성하자!
//public class Main {
//	
//	public static int max(int a, int b) {
//		return ( a > b )? a : b;
//	}
//	
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("생성할 배열의 크기를 입력하세요 : ");
//		int number = scanner.nextInt();
//		int[] arr = new int[number];
//		for(int i = 0; i < number; i++)
//		{
//			System.out.print("배열에 입력할 정수를 하나씩 입력하세요 (양수만) : ");
//			arr[i] = scanner.nextInt();
//		}
//		int result = -1;
//		for(int i = 0; i < number; i++)
//		{
//			result = max(result, arr[i]);
//		}
//		System.out.println("입력한 모든 정수 중에서 가장 큰 수는 : " + result +"입니다");
//
//	}
//
//}

// 100개의 랜덤 정수의 평균을 구하는 프로그램을 작성합니다.
// Math.random()  0 ~ 0.xx 의 소수를 만들어준
public class Main{
	
	public static void main(String[] args) {
		int[] array = new int[100];
		int sum = 0;
		for(int i =0; i < 100; i++)
		{
			array[i] = (int) (Math.random() * 100 + 1);
			sum += array[i];
		}
		
		System.out.println("랜덤한 정수 100개의 평균은 : " + (sum/100) + "입니다!");
	}
}

