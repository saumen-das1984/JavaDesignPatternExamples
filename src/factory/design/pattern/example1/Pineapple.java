package factory.design.pattern.example1;

public class Pineapple extends Cake {

	Pineapple(){
		setName("Pineapple");
		setType("Egg");
		setPrice(600);
	}
	
	public void recipe() {
		 System.out.println("---Pineapple Recipe---");
		 System.out.println("Take 2 Eggs into a bowl ");
		 System.out.println("Add Sugar , Vanilla ,Salt and Baking Powder");
		 System.out.println("Bake for 45 mminutes");
		 System.out.println("Decorate with Pineapple slices");
		
	}
	
	public void myFans() {
	   
		System.out.println("Everyone loves me");
	}

}
