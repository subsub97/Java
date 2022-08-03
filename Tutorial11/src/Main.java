// 재귀함수를 실습 해보자 
public class Main {
	
	// 1. 반복함수
	
	public static int factorial(int number) {
		int sum = 1;
		for(int i =2; i<= number; i++) 
		{
			sum *=i;
		}
		return sum;
	}
	
	// 재귀함수로 구현해보자
	public static int recursive(int number) {
		if(number == 1)
		{
			return 1;
		}
		else
		{
			return number * recursive(number -1);
		}
	}

	public static void main(String[] args) {
		System.out.println("10 팩토리얼은 " +factorial(10));
		System.out.println("10 팩토리얼은 " +recursive(10));
	}

}
