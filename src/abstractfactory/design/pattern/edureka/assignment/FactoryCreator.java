package abstractfactory.design.pattern.edureka.assignment;

public class FactoryCreator {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Event")) {
			return new EventFactory();
		} else if (choice.equalsIgnoreCase("Error")) {
			return new ErrorFactory();
		}
		return null;
	}
}
