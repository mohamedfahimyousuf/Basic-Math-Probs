import java.util.Scanner;
public class LastDigit
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println("The last Digit of the Number is : "+ n%10);
        sc.close();
	}
}
