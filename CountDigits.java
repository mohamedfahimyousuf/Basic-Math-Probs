import java.util.Scanner;
public class CountDigits
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int count = 0;
		if(num==0){
		    System.out.print("Total number of Digits is : 1");
		}
		else{
		    while(num>0){
		        num/=10;
		        count++;
		    }
		    System.out.print("Total number of Digits is : "+count);
		}
        sc.close();
	}
}
