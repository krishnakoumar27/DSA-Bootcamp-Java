import java.util.Scanner;

public class AreaTriangle {
  public static double areaTriangle(double b, double h) {
    return 0.5 * b * h;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the base of the triangle: ");
    double b = sc.nextDouble();
    System.out.println("Please enter the height of the triangle: ");
    double h = sc.nextDouble();
    double area = areaTriangle(b, h);
    System.out.println("The area of triangle: " + area);
  }
}
