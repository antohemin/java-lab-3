package lab3;
import java.util.Scanner;

public class exfour {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("~~~~~~PRIME NUMBER~~~~~~");
	System.out.println(" Enter the number to be checked");
	int n= s.nextInt();
	int m=n/2,i, count=0;
	if((n==0)||(n==1))
	{
		System.out.println(n + " is not a prime number ");
	}
	else
	{
	for(i=2; i<=m; i++)
	{
		if(n%i==0)
			count++;
	}
	}
	
	if(count>0)
		System.out.println(n+ " is not a prime number");
	else
		System.out.println(n + " is a prime number");

}
}

