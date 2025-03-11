public class CharacterType {

	 public static void main(String[] args) {
	        char ch = 'A';
	        String result = (Character.isUpperCase(ch)) ? "Uppercase" : (Character.isLowerCase(ch)) ? "Lowercase" : "Not a letter";
	        System.out.println("Character is: " + result);
	    }
}