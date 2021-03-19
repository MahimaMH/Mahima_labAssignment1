/**
 * Nmae:Mahima M Hampali
 * Description: calculate difference of sum of of the squares and the square of the sum of the first n natural numbers.

 *	Date: 16/03/21
 */
import java.util.Scanner;

public class OperatorAssignment6 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
        System.out.println("The difference is:"+calculateDifference(n));
		
	}
    private static int calculateDifference(int n)
    	{
        	int sum=0;
        	int sumOfN=0,sumOfSquares=0;
        	sumOfN=(n*(n+1)/2);
        	sumOfSquares=((n*(n+1)*(2*n+1))/6);
        	sum=(sumOfN*sumOfN)-sumOfSquares;
        	return sum;
        }
    }

