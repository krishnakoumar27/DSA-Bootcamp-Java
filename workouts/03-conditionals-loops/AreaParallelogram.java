import java.util.Scanner;

public class AreaParallelogram {
  public static double areaParallelogram(double b, double h) {
    return b * h;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base of Parallelogram: ");
    double b = sc.nextDouble();
    System.out.println("Enter the height of Parallelogram: ");
    double h = sc.nextDouble();
    double area = areaParallelogram(b, h);
    System.out.println("The area of parallelogram: " + area);
  }
}
