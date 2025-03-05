import java.util.Scanner;

public class sizePrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		
		switch(size)
		{
		case 1:
			System.out.println("Extra Small");
			break;
		case 2:
			System.out.println("Small");
			break;
		case 3:
			System.out.println("Large");
			break;
		case 4:
			System.out.println("Extra Large");
		default:
			System.out.println("Invalid Size Number");
		}
		sc.close();

	}

}
