package abstractfactory.design.pattern.edureka.assignment;

public class InformationalEvent implements Event {

	private final String eventName;

	@Override
	public String getEventName() {
		return eventName;
	}

	public InformationalEvent() {
		eventName="InformationalEvent";
	}

}
