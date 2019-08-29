package pkg00;

public class Prime {
	public static void main(String[] args) {
		int flag=0;
		int num =11;
		for (int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("number is not prime");
				flag =1;
				break;
			}
		}
			if(flag==0)
			{
				System.out.println("number is prime");
			}
		}
	}


