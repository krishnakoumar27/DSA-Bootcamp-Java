import java.util.Scanner;

public class AreaRhombus {
  public static double areaRhombus(double p, double q) {
    return 0.5 * p * q;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the first diagonal: ");
    double p = sc.nextDouble();
    System.out.println("Please enter the second diagonal: ");
    double q = sc.nextDouble();
    double area = areaRhombus(p, q);
    System.out.println("Area of rhombus: " + area);
  }
}
