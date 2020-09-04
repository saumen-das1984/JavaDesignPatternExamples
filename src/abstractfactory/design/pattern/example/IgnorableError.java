package abstractfactory.design.pattern.example;

public class IgnorableError extends Error {

	@Override
	void setErrorType(String errType) {
		errorType = errType;

	}

}
