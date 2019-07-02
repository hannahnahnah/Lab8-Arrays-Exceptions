
public class InputMismatch extends Exception {

	public InputMismatch(String errorMessage) {
		super(errorMessage);
		errorMessage = "Try again! You must enter the input exactly as prompted.";
	}
}
