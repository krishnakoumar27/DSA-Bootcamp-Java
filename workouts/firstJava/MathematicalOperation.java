package firstJava;
import java.util.Scanner;
public class MathematicalOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any of the following operations: ");
        System.out.println("(+, -, *, /)");
        char operation=sc.next().charAt(0);
        System.out.println("Enter two numbers:");
        System.out.println("------------------");
        System.out.println("Enter the number 1: ");
        double a=sc.nextDouble();
        System.out.println("Enter the number 2: ");
        double b=sc.nextDouble();
        if(operation=='+'){
            System.out.println("Answer is: " + (a+b));
        }
        if(operation=='-'){
            System.out.println("Answer is: " + (a-b));
        }
        if(operation=='*'){
            System.out.println("Answer is: " + (a*b));
        }
        if(operation=='/'){
            if(b>0){
                System.out.println("Answer is: " + (a/b));
            }
        }
    }
}
