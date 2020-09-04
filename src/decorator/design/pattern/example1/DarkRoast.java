package decorator.design.pattern.example1;

  public class DarkRoast extends Beverage{
	public DarkRoast() {
		description="DarkRoast";
	}
	@Override
	public float getCost() {		
		return 10;
	}
  }
  
  
  
