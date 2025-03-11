public class SumandAvg {

	public static void main(String[] args) {
		
		int a[]= {10, 30, 50, 70};
		
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of numbers are: "+sum);
		
		int avg=sum/a.length;
		System.out.println("Average is: "+avg);
	}
}