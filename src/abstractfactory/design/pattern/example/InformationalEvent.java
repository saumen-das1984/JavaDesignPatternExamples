package abstractfactory.design.pattern.example;

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
