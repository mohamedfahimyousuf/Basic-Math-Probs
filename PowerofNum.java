import java.util.Scanner;
public class PowerofNum
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter base : ");
		int base = sc.nextInt();
		System.out.print("Enter Exponent : ");
		int exponent = sc.nextInt();
		int pow = 1;
		for(int i=0;i<exponent;i++){
		    pow = pow*base;
		}
		System.out.println("The Power of the Number is: "+pow);
        sc.close();
	}
}
