public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int a[]= {10, 30, 50, 70, 10, 70};
		
		for(int i=0; i<a.length; i++)
		{
			boolean isSame=false;
			
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
				{
					isSame=true;
					break;
				}	
			}
			
			if(!isSame)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}
