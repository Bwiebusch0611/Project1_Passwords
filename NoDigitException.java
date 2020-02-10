/**
 * Throws exception if no digit is found in the password.
 */


public class NoDigitException extends Exception {

	NoDigitException(){
		
	}
	
	NoDigitException(String message){
		super(message);
	}

}
