public class AtLeastTwoTrue {

	 public static void main(String[] args) {
	        boolean a = true, b = false, c = true;
	        System.out.println((a && b) || (b && c) || (a && c));
	    }
}