import java.util.Scanner;

public class Numberseries {

	public static void main(String[] args) {
		// 1+2+3+4....N
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i = 1,a=1;i<=n;i++,a++)
		{
			sum  = sum+a;
			
		}
		System.out.println(sum);

	}

}
