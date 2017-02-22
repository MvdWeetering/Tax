package codebase;
public class Elfproef {
   
	/** Validate BSN according to http://nl.wikipedia.org/wiki/Burgerservicenummer */
    public static boolean isValidBSN(int candidate) {
        if (candidate <= 9999999 || candidate > 999999999) {
            return false;
        }
        int sum = -1 * candidate % 10;

        for (int multiplier = 2; candidate > 0; multiplier++) {
            int val = (candidate /= 10) % 10;
            sum += multiplier * val;
        }

        return sum != 0 && sum % 11 == 0;
    }
    
    
    public static void main(String[] args) {
		
    	if (isValidBSN(384049497) == true) {
    			System.out.println("true");
    	}
    	else {
    		System.out.println("false");
    	}
	}
   
}
