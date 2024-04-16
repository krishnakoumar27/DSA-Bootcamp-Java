import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter the amount Rs: ");
	    double rupees=sc.nextDouble();
	    System.out.println("The dollar equalant of that amount is $" + (rupees/80));

    }
}
