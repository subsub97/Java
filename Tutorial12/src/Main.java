// 피보나치 반복함수로  구하기
//public class Main {
//	
//	public static int fibonacci(int number) {
//		int one = 1;
//		int two = 1;
//		int result = -1; 
//		if(number ==1)
//		{
//			return one;
//		}
//		else if(number == 2)
//		{
//			return two;
//		}
//		else
//		{
//			for(int i = 2; i < number; i++ )
//			{
//				result = one + two;
//				one = two;
//				two = result;
//			}
//		}
//		return result;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(fibonacci(5));
//		
//	}
//
//}

// 피보나치 재귀함수로 구하기

public class Main{
	
	public static int recursive(int number) {
		if(number ==1) 
		{
			return 1;
		}
		else if(number == 2) 
		{
			return 1;
		}
		else
		{
			return recursive(number -1) + recursive(number -2);
		}
		
	}
	
	public static void main (String[] args) {
		System.out.println(recursive(10));
		
	}
}