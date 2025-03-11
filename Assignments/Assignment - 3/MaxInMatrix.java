public class MaxInMatrix {

	 public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3}, {9, 5, 6}, {7, 8, 4}};
	        int max = Integer.MIN_VALUE;

	        for (int[] row : matrix)
	            for (int num : row)
	                if (num > max) max = num;

	        System.out.println("Maximum element: " + max);
	    }
}