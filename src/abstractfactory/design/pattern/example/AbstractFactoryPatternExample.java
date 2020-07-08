package abstractfactory.design.pattern.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the name of Event(UserActionEvent/InformationalEvent): ");

		String eventName = br.readLine();

		System.out.print("\n");
		System.out.print(
				"Enter the type of Error(HighSeverityError/IgnorableError) you want to show : ");

		String errorType = br.readLine();

		AbstractFactory eventTactory = FactoryCreator.getFactory("Event");

		Event event = eventTactory.getEvent(eventName);
		System.out.print("\n");
		System.out.println("You have selected the event "+ event.getEventName());
		
		AbstractFactory errorFactory = FactoryCreator.getFactory("Error");
        Error error=errorFactory.getError(errorType);
        error.setErrorType(errorType);
        
        System.out.print("\n");
        System.out.println("Generated error type "+ error.errorType);
	}
}
