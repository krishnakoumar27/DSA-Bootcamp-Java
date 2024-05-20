import java.util.Scanner;

public class PerimeterRhombus {
   
   public static double perimeterRhombus(double side) {
    return 4*side;
   }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of the rhombus: ");
        double side = sc.nextDouble();
        System.out.println("The perimeter of rhombus: " + perimeterRhombus(side));
    }
}
