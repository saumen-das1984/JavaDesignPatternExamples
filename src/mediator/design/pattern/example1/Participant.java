package mediator.design.pattern.example1;

  public abstract class Participant {
	protected Mediator mediator;
    protected String name;     
    public Participant(Mediator med, String name){
        this.mediator=med;
        this.name=name;
    }     
    public abstract void send(String msg);     
    public abstract void receive(String msg);	
  }
  
  
  
  
