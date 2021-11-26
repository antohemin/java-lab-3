package lab3;
import java.util.Scanner;

public class exfive {
public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	System.out.println("~~~~~~Average Using Arrays~~~~~");
	System.out.println(" Enter the number of elements required"); 
	int n=s.nextInt();
	int arr[]=new int[n];
	int i, sum=0;
	System.out.println("Enter the elements now");
	for(i=0;i<n; i++)
	{
		arr[i]=s.nextInt();
		sum=sum+arr[i];
	}
	int avg = sum/n;
	System.out.println(" Average of the numbers entered =" + avg);
	

}
}

