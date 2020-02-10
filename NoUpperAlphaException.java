/**
 * Throws exception if no uppercase alphabetic charecter is found in the password.
 */

public class NoUpperAlphaException extends Exception {

	NoUpperAlphaException(){
		
	}
	
	NoUpperAlphaException(String message){
		super(message);
	}

}