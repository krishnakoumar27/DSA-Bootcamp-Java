import java.util.Scanner;

public class Palindrome{

	public static boolean isPalindrome(String str){
		str=str.replaceAll("\\s+","").toLowerCase();
		int left=0;
		int right=str.length()-1;
		while(left!=right){
			if(str.charAt(left)==str.charAt(right)){
			} else {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string to test for palindrome: ");
		String str = sc.next();
		if(isPalindrome(str)){
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}
}
		
