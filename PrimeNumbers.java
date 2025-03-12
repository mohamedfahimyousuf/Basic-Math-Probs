import java.util.*;
public class PrimeNumbers
{
	public static void prime() {
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<2){
		    System.out.println("It is not a prime number");
		    return;
		}
		if(num ==2 || num==3){
		    System.out.println("It is a prime number");
		    return;
		}
		if(num%2==0){
		    System.out.println("It is not a prime number");
		    return;
		}
		for(int i =3;i*i<=num;i++){
		    if(num%i==0){
		        System.out.println("It is not a prime number");
		        return;
		    }
		}
		System.out.println("It is a prime number");
        sc.close();
		
	}
	public static void main(String[] args){
	    prime();
	}
}
