/**
 * Nmae:Mahima M Hampali
 * Description: check number is increasing or not
 *	Date: 16/03/21
 */
import java.util.Scanner;

public class OperatorAssignment7 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(checkNumber(n)==true)
			System.out.println("Increasing Number");
		else
			System.out.println("Not an increasing Number");
	}
	public static boolean checkNumber(int n)
	{
		int x=n%10;
		n=n/10;
		
		while(n>0)
		{
			if(x<n%10) {
				return false;
			}
			else if(x==n%10) {
				return false;
			}
			x=n%10;
			n=n/10;
		}
		return true;
	}
}
		
		

