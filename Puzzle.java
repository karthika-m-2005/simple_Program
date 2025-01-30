package firstproject;

import java.util.Scanner;
class Puzzle
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number1:");
      int num1 = sc.nextInt();
      System.out.println("Enter the Number2:");
      int num2 = sc.nextInt();

      System.out.println(num1+" < "+num2+" "+ (num1<num2));
      System.out.println(num1+" <= "+num2+" "+(num1<=num2));
      System.out.println(num1+" > "+num2+" "+(num1>num2));
      System.out.println(num1+" >= "+num2+" "+(num1>=num2));
      System.out.println(num1+" == "+num2+" "+(num1==num2));
      System.out.println(num1+" != "+num2+" "+(num1!=num2));
      
      sc.close();
    }
  }
