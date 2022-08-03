
public class Main {
	
	final static int N = 15;

	public static void main(String[] args) {
		for(int i = 0; i <= 15; i++)
		{
			for(int j=-N; j <= N;j++) {
				if(i*i +j*j <=N*N) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
