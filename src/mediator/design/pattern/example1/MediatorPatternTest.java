package mediator.design.pattern.example1;

  public class MediatorPatternTest {
	public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();        
        Participant user1 = new User(mediator, "Kelly");
        Participant user2 = new User(mediator, "Brian");
        Participant user3 = new User(mediator, "Alex");
        Participant user4 = new User(mediator, "Romany");
        Participant user5 = new User(mediator, "Mark");        
        mediator.addParticipant(user1);
        mediator.addParticipant(user2);
        mediator.addParticipant(user3);
        mediator.addParticipant(user4);
        mediator.addParticipant(user5);         
        user1.send("Hello Everyone !!");         
    }	
  }
  
  
  
  
  
