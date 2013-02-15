
public class WordPlay {

	/**
	 * changing to see how git works
	 * @param args
	 */
	public static void main(String[] args) {
		String inputString = "Sex at noon taxes.".toLowerCase();
		String textToCheck = inputString.replaceAll("\\W", "");
        char[] textArray = textToCheck.toCharArray();
        System.out.println(isPalindrom(textArray));
        

	}
	
	public static boolean isPalindrom(char[] inputText){
	    int i1 = 0;
	    int i2 = inputText.length - 1;
	    while (i2 > i1) {
	        if (inputText[i1] != inputText[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}

}


