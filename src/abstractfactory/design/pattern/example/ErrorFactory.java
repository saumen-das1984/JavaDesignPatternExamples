package abstractfactory.design.pattern.example;

public class ErrorFactory extends AbstractFactory {

	@Override
	public Event getEvent(String event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Error getError(String errType) {
		if (errType == null) {
			return null;
		}

		if (errType.equalsIgnoreCase("HighSeverityError")) {
			return new HighSeverityError();
		} else if (errType.equalsIgnoreCase("IgnorableError")) {
			return new IgnorableError();
		}
		return null;
	}

}
