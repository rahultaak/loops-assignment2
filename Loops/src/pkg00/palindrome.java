package pkg00;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		
	 
		int sum=0;
		//int n=125;
		
		System.out.println("enter the number");
		Scanner obj =new Scanner(System.in);
		int n=obj.nextInt();
		int v=n;
		while(n>0)
		{
		int r=n%10;
		sum=sum*10+r;
		n=n/10;
		}
     if(v==sum)
{
	System.out.println("number is palindrome");
}
     else {
    	 System.out.println("number is not pelindrome");
     }
	}

}
