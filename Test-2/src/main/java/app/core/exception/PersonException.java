package app.core.exception;

public class PersonException extends Exception{

	private static final long serialVersionUID = 1L;

	public PersonException() {
	}

	public PersonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonException(String message) {
		super(message);
	}

	public PersonException(Throwable cause) {
		super(cause);
	}
	

}
