package lab3;
import java.util.Scanner;

public class exthree {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("~~~~~PALIONDROME~~~~~~");
		System.out.println(" Enter the number to be checked");
		int n=s.nextInt();
		int a=n,r,p=0;
		while(a>0)
		{
			r=a%10;
			p=p*10+r;
			a=a/10;
		}
		if(n==p)
			System.out.println(n + " is paliondrome");
		else
			System.out.println(n + " is not paliondrome");
		
	}
}
