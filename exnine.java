package lab3;
import java.util.*;

public class exnine {
	public static void main(String[] args)
	{
		String a= " Remove all white sapces";
		System.out.println(" The original text is : " + a);
		String b=a.replaceAll("\\s", "");
		System.out.println("The removed text is : " + b);
	}

}
