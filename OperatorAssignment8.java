/**
 * Nmae:Mahima M Hampali
 * Description: check number is power of 2 or not
 *	Date: 16/03/21
 */
import java.util.Scanner;

public class OperatorAssignment8 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int number=sc.nextInt();
       System.out.println(checkNumber(number));
	}
	public static  boolean checkNumber(int n)
	{
		boolean status=false;
		int i=1,m=1;
		while(i>0)
		{
			m*=2;
			if(m==n)
			{
				status=true;
				break;
			}
			else if(m>n)
				break;
			i++;
		}
	    
		return status;
	}

}