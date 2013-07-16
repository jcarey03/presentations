package exp.model;

@SuppressWarnings("serial")
public class ExistingDeclarationException extends RuntimeException {

	public ExistingDeclarationException() {
		super();
	}

	public ExistingDeclarationException(String arg0, Throwable arg1,
			boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public ExistingDeclarationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ExistingDeclarationException(String arg0) {
		super(arg0);
	}

	public ExistingDeclarationException(Throwable arg0) {
		super(arg0);
	}
}
