import java.util.Scanner;
public class GCD
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int b = sc.nextInt();
		int temp=0;
		while(b != 0){
		    temp = b;
		    b = a%b;
		    a = temp;
		}
		System.out.print("The GCD of the Numbers is : "+a);
        sc.close();
	}
}