import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + (isLeap ? " is a Leap Year." : " is NOT a Leap Year."));
	}
}