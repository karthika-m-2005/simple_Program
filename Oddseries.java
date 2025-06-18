import java.util.Scanner;

public class Oddseries {

	public static void main(String[] args) {
		// 1+3+5+..N
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i = 1,a=1;i<=n;i++,a+=2)
		{
			sum  = sum+a;
			
		}
		System.out.println(sum);
		sc.close();

	}

}
