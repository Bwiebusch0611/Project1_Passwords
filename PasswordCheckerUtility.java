import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Check passwords validity and strength to given requirements.
	@author Brandon Wiebusch
 */

public class PasswordCheckerUtility{

	/**
	 * Returns true if valid password. Throws exceptions for invalid passwords. Valid if password is greater than or equal to 6 characters, has at least one digit, has at least on upper-case alphabetic character, has at least on lower-case alphabetic character, and has no more than two of the same character in a row.
	 * @param passwordString String to be tested for validity.
	 * @throws LengthException thrown if length is less than 6 characters
	 * @throws NoDigitException thrown if no digit
	 * @throws NoUpperAlphaException thrown if no uppercase alphabetic
	 * @throws NoLowerAlphaException thrown if no lowercase alphabetic
	 * @throws InvalidSequenceException thrown if more than 2 of same character.
	 * @return true if valid password, set up to return false if an invalid password, but throws an exception instead.
	 */
			
	
	public static boolean isValidPassword(String passwordString) throws LengthException,
																		NoDigitException,
																	    NoUpperAlphaException,
																	    NoLowerAlphaException,
																	    InvalidSequenceException 
		}		
			//Regular Expressions 
																			
		if (passwordString.length() < 6){
			throw new LengthException("The password must be at least 6 characters long.");
		}else if(!Pattern.matches(".*[A-Z].*", passwordString)){ 
			throw new NoUpperAlphaException("The password must contain at least one uppercase alphabetic letter.");
		}else if(!Pattern.matches(".*[a-z].*", passwordString)){
			throw new NoLowerAlphaException("The password must contain at least one lowercase alphabetic letter.");
		}else if(!Pattern.matches(".*\\d.*", passwordString)){	
			throw new NoDigitException("The password must contain at least one digit.");
		}else if(Pattern.matches("^.*(.)\\1\\1.*$", passwordString)){
			throw new InvalidSequenceException("The password cannot contain more than two of the same character in sequence.");
		}else 
			return true;
		}
		
	
	
	
	
	/**
	 * Return true if length of password is greater or equal to 6 but less than or equal to 9
	 * @param passwordString -- string to be checked if weak password
	 * @return true if length of password is greater than or equal to 6 but less than or equal to 9
	 */
		
	
	public static boolean isWeakPassword(String passwordString) {
		if(passwordString.length() >= 6 && passwordString.length() <= 9) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Returns an arraylist of invalid passwords (weak passwords are not considered invalid)
	 * @param passwords - arraylist of passwords to check for validity
	 * @return reasons - arraylist of invalid passwords. It will not return weak passwords.
	 */
	
	
	public static ArrayList<String> invalidPasswords(ArrayList<String> passwords){
		
		ArrayList<String> invalid = new ArrayList<String>();
		
		for(String test : passwords) {
			try {
				isValidPassword(test);
			} catch (Exception e) {
				invalid.add(test + " " + e.getMessage());
			}
		}
		
		return invalid;
		
		
	}
}
	
	
	
	

	