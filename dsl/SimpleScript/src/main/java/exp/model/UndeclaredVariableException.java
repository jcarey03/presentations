package exp.model;

@SuppressWarnings("serial")
public class UndeclaredVariableException extends RuntimeException {

	public UndeclaredVariableException() {
		super();
	}

	public UndeclaredVariableException(String arg0, Throwable arg1,
			boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public UndeclaredVariableException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UndeclaredVariableException(String arg0) {
		super(arg0);
	}

	public UndeclaredVariableException(Throwable arg0) {
		super(arg0);
	}
}
