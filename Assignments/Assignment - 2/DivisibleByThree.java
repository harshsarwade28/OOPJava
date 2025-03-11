public class DivisibleByThree {

	 public static boolean isDivisibleBy3(int num) {
	        num = Math.abs(num);
	        while (num > 3) {
	            int sum = 0;
	            while (num > 0) {
	                sum += num & 1;
	                num >>= 1;
	                sum -= num & 1;
	                num >>= 1;
	            }
	            num = Math.abs(sum);
	        }
	        return (num == 0 || num == 3);
	    }

	    public static void main(String[] args) {
	        int number = 27;
	        System.out.println(number + " is divisible by 3 " + isDivisibleBy3(number));
	    }
}