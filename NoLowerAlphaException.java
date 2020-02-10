/**
 * Throws exception if password does not contain a lowercase alphabetic charecter.
 */

public class NoLowerAlphaException extends Exception {

	NoLowerAlphaException(){
		
	}
	
	NoLowerAlphaException(String message){
		super(message);
	}

}