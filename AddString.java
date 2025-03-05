import java.util.Scanner;

public class AddString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the 2nd String: ");
		String str2 = sc.nextLine();
		
		String str = str1.concat(str2);
		System.out.println("Two Strings: "+str);
		sc.close();

	}

}
