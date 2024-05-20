import java.util.Scanner;

public static double perimeterOfSquare(double side) {
    return 4*side;
}
public class PerimeterSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of one side of the square:");
        double side = sc.nextDouble();
        System.out.println("The perimeter of the square is: " + perimeterOfSquare(side));
    }
}
