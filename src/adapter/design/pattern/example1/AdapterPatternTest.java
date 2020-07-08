package adapter.design.pattern.example1;

  public class AdapterPatternTest {
	public static void main(String args[]){		
		EuropeanCircularSocket euSocket=new EuropeanCircularSocket();
		euSocket.circularSocket();
		
		USRectangularPlug usRectangularPlug=new USRectangularPlug();
		usRectangularPlug.rectangularPlug();
		
		CircularSocket adapter=new RectangularPlugAdapter(usRectangularPlug);
		adapter.circularSocket();
	}
  }
  
  
  
  
  
  
  
  
