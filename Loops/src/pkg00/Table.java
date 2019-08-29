package pkg00;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		
		System.out.println("please enter the number");
		
		Scanner obj = new Scanner(System.in);
		int table = obj.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(table*i);
		}
	}

}
