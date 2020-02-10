/**
 * Throws exception if the password is less than six charecters long.
 */


public class LengthException extends Exception {

	LengthException(){
		
	}
	
	LengthException(String message){
		super(message);
	}

}