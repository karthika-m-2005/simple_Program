import java.util.Scanner;
class Simple_Interest
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the P Value: ");
      int P = sc.nextInt();
      System.out.println("Enter the R Value: ");
      int R = sc.nextInt();
      System.out.println("Enter the T Value: ");
      int T = sc.nextInt();
      int SI = (P*R*T)/100;
      System.out.println("Simple Interest: "+SI);
      sc.close();
      
    }
  }
