public class EvenOdd {

    public static void main(String[] args) {
		
        if (args.length < 1) {
            System.out.println("Please provide a number.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
