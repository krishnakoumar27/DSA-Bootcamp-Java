import java.util.Scanner;

public class Armstrong {

	public static int isArmstrong(int a) {
		int current=0;
		int sum=0;
		String value = Integer.toString(a);
		int digits=value.length();
		while(a>0){
			current=a%10;
			int count=digits;
			while(count>0) {
				current*=current;
				count--;
			}
			sum+=current;
			a=a/10;
		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter lower bond: ");
		int x = sc.nextInt();
		System.out.println("Please enter upper bond: ");
		int y = sc.nextInt();
		for(int i=x;i<=y;i++){
			if(isArmstrong(i)==i){
				System.out.println(i); 
			} 
		} 
	} 
}
