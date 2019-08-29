package pkg00;

public class Fibnocci_series {
	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum;
		for(int i=0;i<=10;i++)
		{
			sum = a+b;
			System.out.print( " "+ sum);
			a=b;
			b=sum;
		}
	}

}
