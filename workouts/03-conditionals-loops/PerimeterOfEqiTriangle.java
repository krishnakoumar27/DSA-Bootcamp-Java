import java.util.Scanner;

public class PerimeterOfEqiTriangle {
  public static double perimeterEqiTriangle(double a) {
    return 3 * a;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of equilateral triangle: ");
    double a = sc.nextDouble();
    double perimeter = perimeterEqiTriangle(a);
    System.out.println("Perimeter of Equilateral Triangle: " + perimeter);
  }
}
