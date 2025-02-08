package firstproject;
import java.util.Arrays;
import java.util.Scanner;


class Studets
{
	String Name;
	int Roll_No;
	int[] Mark;
	
	void MarkTotal()
	{
		System.out.println("Name: "+Name);
		System.out.println("Roll_No: "+Roll_No);
		System.out.println("Mark: "+ Arrays.toString(Mark));
		
		
	}
}

public class Student {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Studets stu = new Studets();
		System.out.println("Enter the Name of the Student: ");
		stu.Name = sc.nextLine();
		System.out.println("Enter the Roll Number: ");
		stu.Roll_No = sc.nextInt();
		System.out.println("Enter the Marks: ");
		
		stu.Mark = new int[5];
		
		for(int i = 0;i<5;i++)
		{
		   stu.Mark[i] = sc.nextInt();
		}
		
		stu.MarkTotal();
		sc.close();
		
		

	}

}
