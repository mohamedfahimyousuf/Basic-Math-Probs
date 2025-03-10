import java.util.Scanner;
public class EvenOrOdd
{
	public static void main(String[] args) {
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0){
		    System.out.println("The Number is Even");
		}
		else{
		    System.out.println("The Number is Odd");
		}
	}
}
