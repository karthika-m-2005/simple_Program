import java.util.Scanner;
public class Solution {



     Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        if(N%2!=0)
        {
            System.out.println("Weird");
        }
        else if((N%2==0 && N>=2 && N<=5) || (N%2==0 && N>20) )
        {
            System.out.println("Not Weird");
        }
        else if(N%2==0 && N>=6 && N<=20)
        {
            System.out.println("Weird");
        }
        scanner.close();
    }
}
