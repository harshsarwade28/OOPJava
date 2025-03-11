public class RightShift {

	public static void main(String[] args) {
		
		int[] a= {10, 20, 30, 40, 50};
		
		//Right Shift
//		int temp= a[a.length-1];
//		
//		for(int i=a.length-1; i>0; i--)
//		{
//			a[i]=a[i-1];
//		}
//		
//		a[0]=temp;
//		
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		
		
		// Left Shift
		int temp=a[0];
		
		for(int i=0; i<a.length-1; i++)
		{
			a[i]=a[i+1];
		}
		
		a[a.length-1]=temp;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
