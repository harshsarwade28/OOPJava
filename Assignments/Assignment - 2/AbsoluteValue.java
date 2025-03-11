public class AbsoluteValue {

	public static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 29; 
        System.out.println(countOnes(num));
    }
}