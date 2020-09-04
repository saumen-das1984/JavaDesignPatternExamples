package builder.pattern.edureka.module2;

 public class NYKPizzaBuilder implements PizzaBuilder {
	private Pizza pizza;	
	@Override
	public Pizza getPizza() {		
		return pizza;
	}	
	public NYKPizzaBuilder() {
		this.pizza=new Pizza();
	}
	@Override
	public void buildDough() {
		pizza.setDough("Sugar and Yeast dough");		
	}
	@Override
	public void buildCheese() {		
		pizza.setCheese("Mozzarella Cheese");
	}
	@Override
	public void buildTopping() {		
		pizza.setTopping("Sliced Hard Salami");
	}	
  }

 