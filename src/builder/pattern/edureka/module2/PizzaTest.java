package builder.pattern.edureka.module2;

  public class PizzaTest {
	public static void main(String[] args) {		
		Pizza simplePizza=new Pizza();
		Pizza noCheesePizza=new Pizza("Salted Dough");
		Pizza nykPizza=new Pizza("Sugar and Yeast Dough","Mozzarella Cheese");
		Pizza italianPizza=new Pizza("Soft Dough","Italian Cheese","Sliced Pepproni");			
	}
  }


