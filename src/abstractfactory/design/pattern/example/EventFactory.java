package abstractfactory.design.pattern.example;

public class EventFactory extends AbstractFactory {

	@Override
	public Event getEvent(String event) {
		if(event == null){
	         return null;
	      }

			
	      if(event.equalsIgnoreCase("UserActionEvent")){
	         return new UserActionEvent();
	      } else if(event.equalsIgnoreCase("InformationalEvent")){
	         return new InformationalEvent();
	      }
		return null;
	}

	@Override
	public Error getError(String errType) {
		// TODO Auto-generated method stub
		return null;
	}

}
