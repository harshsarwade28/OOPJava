public class TypeCasting {
	
    public static void main(String[] args) {
      
        int num = 846;
        double doubleNum = num;
        System.out.println("Implicit Casting (int to double): " + doubleNum);

        
        double d = 89.45;
        int intNum = (int) d;
        System.out.println("Explicit Casting (double to int): " + intNum);
    }
}
