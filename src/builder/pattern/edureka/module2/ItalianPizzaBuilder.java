package builder.pattern.edureka.module2;

 public class ItalianPizzaBuilder implements PizzaBuilder {
	private Pizza pizza;	
	@Override
	public Pizza getPizza() {		
		return pizza;
	}	
	public ItalianPizzaBuilder() {
		this.pizza=new Pizza();
	}
	@Override
	public void buildDough() {
		pizza.setDough("Soft dough");		
	}
	@Override
	public void buildCheese() {		
		pizza.setCheese("Italian Cheese");
	}
	@Override
	public void buildTopping() {		
		pizza.setTopping("Sliced Pepperoni");
	}
  }
 
 
 
