package mediator.design.pattern.example1;

import java.util.ArrayList;
import java.util.List;

 public class ChatMediator implements Mediator {
	private List<Participant> users;    
    public ChatMediator(){
        this.users=new ArrayList<Participant>();
    }     
    @Override
    public void addParticipant(Participant user){
        this.users.add(user);
    }     
    @Override
    public void sendMessage(String msg, Participant user) {
        for(Participant u : this.users){           
            if(u != user){
                u.receive(msg);
            }
        }
    }	
  }
 
 
 
 
 
