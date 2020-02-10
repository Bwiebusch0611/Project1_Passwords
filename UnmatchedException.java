/**
 * Throws exception if the two passwords entered are not the same.
 */


public class UnmatchedException extends Exception {

	UnmatchedException(){}
	
	UnmatchedException(String message){
		super(message);
	}

}