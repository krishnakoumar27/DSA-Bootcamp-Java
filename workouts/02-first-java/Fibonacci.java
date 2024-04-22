import java.util.Scanner;

public class Fibonacci{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of n: ");
		int n=sc.nextInt();
		int a=0;
		System.out.print(a + " ");
		int b=1;
		System.out.print(" "+b+" ");
		int z=0;
		for(int i=2;i<=n;i++){
			z=a+b;
			a=b;	
			b=z;
			System.out.print(" "+z+" ");
		}
	}
}


