import java.util.Scanner;
import java.lang.Math; 

public class AreaTriangle {
  public static double areaTriangle(double a, double b, double c) {
    double s = 0.5 * (a + b + c);
    return Math.sqrt(s*((s-a)*(s-b)*(s-c)));
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter side a of triangle: ");
    double a = sc.nextDouble();
    System.out.println("Please enter side b of triangle: ");
    double b = sc.nextDouble();
    System.out.println("Please enter side c of triangle: ");
    boolean flag = true;
    double c = 0;
    while(flag) {
      c = sc.nextDouble();
      if((a + c) > b) {
        flag = false;
      } else {
        System.out.println("a + c must be greater than b...");
      }
    }
    double area = areaTriangle(a, b, c);
    System.out.println("The area of triangle: " + area);
  }
}
