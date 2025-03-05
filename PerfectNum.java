import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		for(int i =1;i<num;i++){
		    if(num%i==0){
		        sum+=i;
		    }
		}
		if(temp==sum){
		    System.out.println("It is a Perfect Number");
		}
		else{
		    System.out.println("It is not a Perfect Number");
		}
		sc.close();
	}
}
