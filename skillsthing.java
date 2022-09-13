import java.util.Scanner;

public class problemthing
{
  public static void main(String[] args)
  {
    //FIRST PROGRAM
    /* Boolean run = false;
    Scanner sc = new Scanner(System.in);
    while (run==false)
    {
      System.out.println("Please input a single positive integer ");
      int input = sc.nextInt();
      if (input > -1 && input < 10)
      {
        System.out.println(input);
        run = true;
      }
    }
    */

    //SECOND PROGRAM
    /*
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the dividend: ");
    int dividend = sc.nextInt();
    System.out.println("Enter the divisor: ");
    int divisor = sc.nextInt();

    //your code here
    int repDividend = dividend;
    while (repDividend >= divisor)
    {
      repDividend -= divisor;
    }
    if (repDividend ==0)
    System.out.println("The dividend is divisible by the divisor");
    else
    System.out.println("The dividend is not divisible by the divisor");
    */

    //THIRD PROGRAM
    /*Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer to see its digits: ");
    int number = sc.nextInt();

    //Your code here
    while (number >= 1)
    {
      System.out.println(number % 10);
      number /= 10;
    }
    */

    //FOURTH PROGRAM
    /*Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int number = sc.nextInt();

    //Your code here
    int count = 0;
    while (number >= 1)
    {
    int variable = number % 10;
    if (variable == 1)
    count += 1;
    number /= 10;
    }
    System.out.println(count);
    */

    //FIFTH PROGRAM
    /*Scanner sc = new Scanner(System.in);
    System.out.println("Enter a the number of numbers to input: ");
    int number = sc.nextInt();
    int max = -2147483647;
    int min = 2147483647;
    while (number > 0)
    {
      System.out.println("Enter a number");
      int input = sc.nextInt();
      if (input > max)
      {
        max = input;
      }
      if (input < min)
      {
        min = input;
      }
      number -= 1;
    }
    System.out.println("The minimum in your series is " + min);
    System.out.println("The maximum in your series is " + max);
    */

    //FIFTH PROGRAM
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a the number of numbers to input: ");
    int number = sc.nextInt();
    int total = 0;
    int inputs = number;
    while (number > 0)
    {
      System.out.println("Enter a number");
      int input = sc.nextInt();
      total += input;
      number -= 1;
    }
    System.out.println("Total: " + total);
    System.out.println("Average is: " + (total/inputs));
  }
}