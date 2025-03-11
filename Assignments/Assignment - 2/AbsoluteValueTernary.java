public class AbsoluteValueTernary {

	public static void main(String[] args) {
        int num = -10;
        int abs = (num < 0) ? -num : num;
        System.out.println("Absolute value: " + abs);
    }
}