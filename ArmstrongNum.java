import java.util.*;
public class ArmstrongNum
{
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tempcount = num;
		int digit =0;
		int sum =0;
		while(tempcount>0){
		    tempcount = tempcount/10;
		    digit++;
		}
		int temp = num;
		while(temp>0){
		    int lastdigit = temp%10;
		    sum += Math.pow(lastdigit,digit);
		    temp /= 10;
		}
		
		if(sum == num){
		    System.out.println("It is an Armstrong Number");
		}
		else{
		    System.out.println("It is not an Armstrong Number");
		}
		sc.close();
	}
}
