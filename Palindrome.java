import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int rev = 0;
        int temp=num;
        while(temp>0){
            int lastdigit = temp%10;
            rev = (rev*10)+lastdigit;
            temp/=10;
        }
        System.out.println("Reverse of the Number: "+rev);
        if(rev == num){
            System.out.println("It is an Palindrome Number");
        }
        else{
            System.out.println("It is not an Palindrome Number");
        }
        sc.close();
    }
}