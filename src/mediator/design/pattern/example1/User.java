package mediator.design.pattern.example1;

 public class User extends Participant{
	public User(Mediator med, String name) {
        super(med, name);
    } 
    @Override
    public void send(String msg){
        System.out.println(this.name+": Sending Message="+msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }	
  }
 
 
 
 
