import java.util.Scanner;
public class SquareRoot
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		double num = sc.nextDouble();
		int sqrt=1;
		for(int i=1;i*i<=num;i++){
		    sqrt = i;
		}
		System.out.println("Sqrt: "+sqrt); //for only whole numbers
		System.out.println("Sqrt: "+Math.sqrt(num));
        sc.close();
	}
}
