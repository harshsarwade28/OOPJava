public class n {

	public static void main(String[] args) {
		
		int arr[]= {10, 11, 30, 44, 50, 70};
		
		int even=0;
		int odd=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				even++;
			else
				odd++;
		}
		
		System.out.println("Even count: "+even);
		System.out.println("Odd count: "+odd);
	}
}