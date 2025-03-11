import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a number");
		int no=sc.nextInt();
		
		if((no&1)==0)
		{
			System.out.println("Even...");
		}
		else
		{
			System.out.println("Odd...");
		}
		
	}
}