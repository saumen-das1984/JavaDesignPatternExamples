package decorator.design.pattern.example1;

 public class Soy extends Decorator {	
	Beverage beverage;	
	public Soy(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {		
		return beverage.getDescription()+", Soy";
	}
	@Override
	public float getCost() {		
		return beverage.getCost()+15;
	}
 }
 
 
 
 
