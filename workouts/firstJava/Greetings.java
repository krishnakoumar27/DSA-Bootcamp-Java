package firstJava;
import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=sc.next();
        System.out.println("Hello " + name + "!");
    }
}
