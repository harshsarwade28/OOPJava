import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		
		int[] a= {1, 2, 3, 4};
		int[] b= {5, 6, 7, 8};
		int[] m= new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++)
		{
			m[i]=a[i];
		}
		
		for(int i=0; i<a.length; i++)
		{
			m[a.length+i]=b[i];
		}
		Arrays.sort(m);
		
		System.out.println("sorted: "+Arrays.toString(m));
	}
}
