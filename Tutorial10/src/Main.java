//
//public class Main {
//	// 반환형 함수명 인자
//	// n번째 약수를 찾는다.
//	public static int function(int number,int k) {
//		for(int i = 1; i <= number; i++) 
//		{
//			if(number % i == 0)
//			{
//				k--;
//				if(k == 0)
//				{
//					return i;
//				}
//			}
//		}
//		return -1;
//			
//	}
//	
//	public static void main(String[] args) {
//		int result = function(3050,10);
//		if(result == -1) 
//		{
//			System.out.println("3050의 10번째 약수는 없습니다.");
//		}
//		else
//		{
//			System.out.print("3050의 10번째 약수는 " +result +"입니다.");
//		}
//
//	}
//
//}

// 문자열에서 마지막 단어를 반환하는 함수 작성
//public class Main{
//	// String은 class 형태로 존재하여 여러가지 메소드를 가지고있다
//	//charAt은 문자하나를 선택하는 메소드 charAt은 index가 0부터 출발, length는 1부터 출발 하여 - 1을 하였다.
//	public static char function(String input) {
//		return input.charAt(input.length() - 1);
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Hello World의 마지막 단어는 " + function("Hello World"));
//	}
//
//}

// max()를 이용하여 최대값을 저장하는 프로그램 작성
public class Main {
	
	public static int max(int a,int b) {
		// 3항 연산자 이용 참이면 a 반환 거짓이면 b 반
		return (a > b) ? a : b;
	}
	public static int function(int a,int b,int c) {
		int result = max(a,b);
		result = max(result,c);
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("(345 , 567 , 789) 중에서 가장 큰 값은 " + function(345,567,789));
		
	}
}