package problem1;


import java.util.Scanner;
public class Problem1 {

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st: ");
        double int1 = scan.nextDouble();
        System.out.print("Enter the 2nd: ");
        double int2 = scan.nextDouble();
        System.out.print("Enter the 3rd: ");
        double int3 = scan.nextDouble();
        scan.close();
        System.out.print("The average is:" + avr(int1, int2, int3) );
    }

  public static double avr(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}