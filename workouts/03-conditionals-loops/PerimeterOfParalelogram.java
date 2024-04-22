import java.util.Scanner;

public class PerimeterOfParalelogram {
  public static double perimeterParalelogram(double a, double b) {
    return 2 * (a + b);
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter length: ");
    double length = sc.nextDouble();
    System.out.println("Please enter breath: ");
    double breath = sc.nextDouble();
    double perimeter = perimeterParalelogram(length, breath);
    System.out.println("Perimeter of Paralelogram: " + perimeter);
  }
}
