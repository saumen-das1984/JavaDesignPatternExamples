package abstractfactory.design.pattern.edureka.assignment;

public abstract class AbstractFactory {
	public abstract Event getEvent(String event);

	public abstract Error getError(String errType);
}
