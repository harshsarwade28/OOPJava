public class StudentScores {

	 public static void main(String[] args) {
	        int[][] marks = {{85, 90, 80}, {40, 35, 45}, {75, 80, 85}}; // Example data
	        int high = 0, low = 0;

	        for (int[] student : marks) {
	            int total = student[0] + student[1] + student[2];
	            double percentage = total / 3.0;
	            if (percentage >= 75) hingh++;
	            if (percentage <= 40) low++;
	        }

	        System.out.println("75%+ Students: " + high);
	        System.out.println("40%- Students: " + low);
	    }
}
