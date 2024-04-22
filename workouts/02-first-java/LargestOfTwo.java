package firstJava;
import java.util.Scanner;

public class LargestOfTwo {

    static double greatestOfTwo(double x, double y) {
        if(x>y){return x;}
        else{return y;}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println(greatestOfTwo(a,b));
    }
}
