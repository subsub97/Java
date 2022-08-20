
public class Main {

	public static void main(String[] args) {
//		NODE class 사용해보기
		Node one = new Node(10,20);
		Node two = new Node(30,40);
		Node result = one.getCenter(two);
		
		System.out.println("x : " + result.getX() + ", y : " + result.getY());

	}

}




 
