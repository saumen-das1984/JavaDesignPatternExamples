package decorator.design.pattern.example1;

  public class TestDecorator {
	  
	public static void main(String args[]){
		Beverage espresso=new Espresso();
		System.out.println(espresso.getDescription()+"  "+espresso.getCost());
		
		Beverage cappuccinoWithMilkAndSoy=new Soy(new Milk(new Cappuccino()));
		System.out.println(cappuccinoWithMilkAndSoy.getDescription()+"  "+cappuccinoWithMilkAndSoy.getCost());
		
		Beverage darkRoastWithSoyMochaMilk=new Soy(new Milk(new Mocha(new DarkRoast())));
		System.out.println(darkRoastWithSoyMochaMilk.getDescription()+"  "+darkRoastWithSoyMochaMilk.getCost());
	}
  }
  
  
  
  
