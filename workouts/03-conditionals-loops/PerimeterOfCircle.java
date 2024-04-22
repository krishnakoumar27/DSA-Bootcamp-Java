import java.util.Scanner;

public class PerimeterOfCircle {
  public static double perimeterCircle(double radius) {
    return 2 * 3.14 * radius;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of cirlce: ");
    double radius = sc.nextDouble();
    double perimeter = perimeterCircle(radius);
    System.out.println("Perimeter of circle: " + perimeter);
  }
}
