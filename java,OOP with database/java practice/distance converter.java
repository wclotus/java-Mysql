package problem1;

import java.util.Scanner;
public class Problem2 {
    
    
    static double convertIntoKms(double miles){
        double km=1.609*miles;
        return km;
    }
    
   
    static double convertIntoMiles(double km){
        double miles=km/1.609;
        return miles;
    }
    
    public static void main(String[] args) {
        try{
            Scanner sc  =   new Scanner(System.in);
            System.out.print("Enter Distance in Miles  : ");
            double miles   =   sc.nextDouble();
            System.out.println(miles+" Miles equal to : "+convertIntoKms(miles)+" KMs");
            
            System.out.print("Enter Distance in Km  : ");
            double kms   =   sc.nextDouble();
            System.out.println(kms+" KMs equal to : "+convertIntoMiles(kms)+" Miles");
            
            
        }
        catch(Exception E){
            System.err.println("Exception : "+E.getMessage());
        }
    }
}