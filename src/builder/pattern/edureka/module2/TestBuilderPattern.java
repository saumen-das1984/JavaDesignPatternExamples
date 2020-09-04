package builder.pattern.edureka.module2;

    public class TestBuilderPattern {    	
	 public static void main(String args[]){
		 
		ItalianPizzaBuilder italian=new ItalianPizzaBuilder();
		Waiter waiter=new Waiter(italian);
		
		waiter.createPizza();		
		Pizza pizza=waiter.getPizza();
		
		System.out.println("Dough : "+pizza.getDough());
		System.out.println("Cheese : "+pizza.getCheese());
		System.out.println("Topping : "+pizza.getTopping());
	 }
   }

    
    
    
    