import java.util.Scanner;

public class MatrixProduct {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][3];
		int sum[][] = new int[3][3];
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("Enter 1st matrix elements: ");
				arr1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("Enter 2nd matrix elements: ");
				arr2[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				sum[i][j]=arr1[i][j]*arr2[i][j];
			}
		}
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}