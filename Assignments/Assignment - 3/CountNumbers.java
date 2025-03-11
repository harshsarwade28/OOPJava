public class CountNumbers {

	public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) arr[i] = i + 1;

        int even = 0, odd = 0, multiplesOf3 = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
            if (num % 3 == 0) multiplesOf3++;
        }

        System.out.println(even);
        System.out.println(odd);
        System.out.println(multiplesOf3);
    }
}