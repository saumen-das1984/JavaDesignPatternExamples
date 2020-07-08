package adapter.design.pattern.example1;

  public class RectangularPlugAdapter implements CircularSocket {
     RectangularPlug rectangularPlug;     
     RectangularPlugAdapter(RectangularPlug rectangularPlug){
    	 this.rectangularPlug=rectangularPlug;
     }     
	@Override
	public void circularSocket() {		
		//Adaption logic goes here 
		System.out.println("Adapts a Rectangular Plug to Circular Socket");
		//Delegate calls to RectangularPlug
	}
  }
  
  
  
  
