package bridge.design.pattern.example1;

  public class BridgePatternTest {
	public static void main(String args[]){			
		Shape circle=new Circle();
		Pattern solidPattern=new SolidFillPattern();
		circle.applyPattern(solidPattern);
		circle.draw();
		
		Shape triangle=new Triangle();
		Pattern strippedPattern=new StrippedFillPattern();
		triangle.applyPattern(strippedPattern);
		triangle.draw();		
	 }	
   }

 
 
 
 
 