package lab3;
import java.util.Scanner;

public class exsix {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("~~~~Largest Element in an Array~~~~~");
		System.out.println("Enter the number of elements required in the Array");
		int n= s.nextInt();
		int arr[] = new int[n];
		int i, pos;
		System.out.println(" Enter the elements into the array");
		for(i=0; i<n; i++)
			arr[i]=s.nextInt();
		int l= arr[0];
		for(i=1;i<n;i++)
		{
			if(arr[i]>l)
				{
				l=arr[i];
				pos=i;
				}
			
		}
		System.out.println(" The largest number in the array is "+ l);
	}

}
