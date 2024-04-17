import java.util.Scanner;

public class AreaIsoTriangle {
  public static double areaIsoTriangle(double base, double height) {
    return 0.5 * base * height;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base of triangle: ");
    double base = sc.nextDouble();
    System.out.println("Enter the height of triangle: ");
    double height = sc.nextDouble();
    double area = areaIsoTriangle(base, height);
    System.out.println("Area of Isosceles Triangle: " + area);
  }
}
