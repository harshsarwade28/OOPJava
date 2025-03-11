public class MaxProductPair {

	public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, -7, 5, 8, -5};
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) max2 = num;
        }

        System.out.println("Pair: (" + max1 + ", " + max2 + "), Product: " + (max1 * max2));
    }
}