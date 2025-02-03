import java.util.Scanner;

public class jump {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		

		int sum=0;
		
		while(true)
		{
			int n = sc.nextInt();
			sum +=n;
			if(n<0)
			{
				break;
			}
			
		}
		System.out.println("sum is: "+sum);
		

	}

}
