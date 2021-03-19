/**
 * Nmae:Mahima M Hampali
 * Description: calculate sum of n natural numbers that are divided by 3 & 5
 *	Date: 16/03/21
 */

import java.util.Scanner;
public class OperatorAssignment5 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");
	int n=sc.nextInt();
	System.out.println("The sum of natural number upto "+n+" is:"+ calculateSum(n));
	

}
private static int calculateSum(int n) {
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		if((i%3==0)||(i%5==0))
		{
			sum+=i;
		}
	}
	return sum;
}
}

	

