package abstractfactory.design.pattern.edureka.assignment;

public class UserActionEvent implements Event {
	
	private final String eventName;

	@Override
	public String getEventName() {
		return eventName;
	}

	public UserActionEvent() {
		eventName="UserActionEvent";
	}

}
