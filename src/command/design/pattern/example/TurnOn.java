package command.design.pattern.example;

  public class TurnOn implements Command{
	Television tv;	
	@Override
	public void execute() {
		tv.on();		
	}	
	TurnOn(Television tv){
		this.tv=tv;
	}	
	@Override
	public void undo() {
		tv.off();
	}
  }
  
  
  
  
