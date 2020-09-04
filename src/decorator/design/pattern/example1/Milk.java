package decorator.design.pattern.example1;

  public class Milk extends Decorator {	
	Beverage beverage;	
	public Milk(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {		
		return beverage.getDescription()+", Milk";
	}
	@Override
	public float getCost() {		
		return beverage.getCost()+5;
	}
  }
  
  
  
  
