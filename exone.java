package lab3;
import java.util.Scanner;

public class exone {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("~~~~~~~REVERSING A NUMBER~~~~~~~");
	System.out.println("Enter the number to be reversed");
	int n= s.nextInt();
	int i, r, t=0;
	System.out.println("Before Reversing = "+ n);
	while(n>0)
	{
		r=n%10;
		t=t*10+r;
		n=n/10;
	}
	System.out.println("After Reversing = "+ t);
}
}
