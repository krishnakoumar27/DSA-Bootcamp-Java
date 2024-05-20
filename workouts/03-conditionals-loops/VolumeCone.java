import java.util.Scanner;

public class VolumeCone {

    public static double volumeOfCone(double r, double h) {
        return (3.14*r*r*h)/3;
    }
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of cone base: ");
    double radius = sc.nextDouble();
    System.out.println("Enter the height of the cone: ");
    double height = sc.nextDouble();
    System.out.println("The volumne of the cone is: " + volumeOfCone(radius, height));
   } 
}
