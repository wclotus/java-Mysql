package problem1;

import java.util.Scanner;

public class Problem4{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter distance in kms: ");
        double kms = in.nextDouble();
        System.out.print("Enter fuel consumption rate: ");
        double rate = in.nextDouble();
        System.out.print("Enter price of petrol: ");
        double price = in.nextDouble();
        double cost = kms / rate * price;
        System.out.println("Total car fuel consumption = " + cost);
        in.close();
    }
}
