package firstJava;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double p=sc.nextDouble();
        System.out.println("Enter the time (years): ");
        double t=sc.nextDouble();
        System.out.println("Enter the rate (percentage): ");
        double r=sc.nextDouble()/100;
        System.out.println("The principal amount is " + (p*t*r));
    }
}
