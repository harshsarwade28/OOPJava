public class TransposeMatrix {

	public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int r = a.length, c = a[0].length;
        int[][] transpose = new int[c][r];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                transpose[j][i] = a[i][j];

        for (int[] row : transpose) {
            for (int num : row) 
            	System.out.print(num + " ");
            System.out.println();
        }
    }
}