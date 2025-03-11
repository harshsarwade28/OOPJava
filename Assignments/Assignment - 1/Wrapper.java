public class Wrapper {

    public static void main(String[] args) {
      
        Integer intVal = 78;
        Double doubleVal = intVal.doubleValue();
        System.out.println("Integer to Double: " + doubleVal);

       
        Double d = 59.36;
        Integer intConverted = d.intValue();
        System.out.println("Double to Integer: " + intConverted);
    }
}
