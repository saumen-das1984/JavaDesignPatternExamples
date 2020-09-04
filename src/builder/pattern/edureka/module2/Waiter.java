package builder.pattern.edureka.module2;

  public class Waiter {	
	private PizzaBuilder pizzaBuilder;
	  public Waiter(PizzaBuilder pb) { 
		  this.pizzaBuilder = pb; 
		  }
	  public Pizza getPizza() {
		  return pizzaBuilder.getPizza(); 
		  }
	  public void createPizza() {	    
	    pizzaBuilder.buildDough();
	    pizzaBuilder.buildCheese();
	    pizzaBuilder.buildTopping();
	  }
   }
  
  
