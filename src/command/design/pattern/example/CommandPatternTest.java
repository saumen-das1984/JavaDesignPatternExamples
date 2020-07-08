package command.design.pattern.example;

  public class CommandPatternTest
  {
    public static void main(String[] args)    {               
        Television tv=RemoteControl.getDevice();
        
        Command turnOff = new TurnOff(tv);
        Command turnOn = new TurnOn(tv);       
        
        Button onButton =new Button(turnOn);
        onButton.click();
        
        Button offButton =new Button(turnOff);
        offButton.click();     
    }
  }
  
  
  