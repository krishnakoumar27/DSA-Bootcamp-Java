import java.util.Scanner;

public class AreaRectangle {

  public static double areaOfRectangle(double l, double h) {
    return l * h;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // get the length
    System.out.println("Enter the length of rectangle: ");
    double l = sc.nextDouble();
    // get the width or height
    System.out.println("Enter the height of rectangle: ");
    double h = sc.nextDouble();
    double area = areaOfRectangle(l, h);
    System.out.println("Area of rectangle: " + area);
  }
}
