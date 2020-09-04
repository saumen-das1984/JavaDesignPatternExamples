package decorator.design.pattern.example1;

 public class Mocha extends Decorator {	
	Beverage beverage;	
	public Mocha(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {		
		return beverage.getDescription()+", Mocha";
	}
	@Override
	public float getCost() {		
		return beverage.getCost()+10;
	}
 }
 
 
