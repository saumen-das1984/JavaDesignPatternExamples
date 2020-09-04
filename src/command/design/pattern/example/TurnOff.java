package command.design.pattern.example;

  public class TurnOff implements Command{
    Television tv;
	@Override
	public void execute() {
		tv.off();		
	}   
	TurnOff(Television tv){
		this.tv=tv;
	}	
	@Override
	public void undo() {
		tv.on();		
	}
   }
  
  
  
