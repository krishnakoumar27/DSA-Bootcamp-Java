import java.util.Scanner;

public class AreaCircle {
  public static double areaCircle(double pi, double radius) {
    return pi * radius * radius;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double pi = 3.14;
    System.out.println("Please enter the radius of the circle: ");
    double radius = sc.nextDouble();
    double area = areaCircle(pi, radius);
    System.out.println("Area of the circle: " + area);
  }
}
