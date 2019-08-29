package pkg00;

           

public class Triple_loop {
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for (int k=i;k>=1;k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}


