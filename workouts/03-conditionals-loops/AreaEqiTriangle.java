import java.util.Scanner;
import java.lang.Math;

public class AreaEqiTriangle {
  public static double areaEqiTriangle(double a) {
    return (Math.sqrt(3)/4) * a * a;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the side of the triangle: ");
    double a = sc.nextDouble();
    double area = areaEqiTriangle(a);
    System.out.println("Area of Equilateral Triangle: " + area);
  }
}
