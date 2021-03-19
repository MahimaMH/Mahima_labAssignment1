import java.util.Scanner;
public class Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.print("Enter numer: ");
		
		int num=in.nextInt();
		
		if(num==1) {
			System.out.println("Red light: STOP");
		}
		else if(num==2){
			System.out.println("Yellow light: Ready");
		}
		else {
			System.out.println("Green light: Go");
		}
	}

}
