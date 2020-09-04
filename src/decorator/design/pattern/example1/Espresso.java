package decorator.design.pattern.example1;

  public class Espresso extends Beverage{
	Espresso(){
		description="Espresso";
	}
	@Override
	public float getCost() {
		return 15;
	}
  }
  
  
