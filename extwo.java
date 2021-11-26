package lab3;
import java.util.Scanner;

public class extwo {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("~~~~~~ Power of a Number ~~~~~~");
		System.out.println(" Enter the number whose power needs to be calculated");
		int n = s.nextInt();
		System.out.println(" Enter the power ");
		int p = s.nextInt();
		int i, r=1;
		for(i=1; i<=p;i++)
		{
			r=r*n;
		}
		System.out.println("Result = " + r);
	}
}
