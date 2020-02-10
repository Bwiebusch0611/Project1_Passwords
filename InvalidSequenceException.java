/**
 * Throws exception if more than two of the same charecter are in sequence while checking the password.
 */


public class InvalidSequenceException extends Exception {

	InvalidSequenceException(){
		
	}
	
	InvalidSequenceException(String message){
		super(message);
	}

}