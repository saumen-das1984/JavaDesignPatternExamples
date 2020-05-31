package prototype.design.pattern.edureka.module2;

  public class TestPrototype {

	public static void main(String args[]){
		Wolf wolf=new Wolf();
		// Perform operation on Wolf object
		
	   // Needed a Wolf object again
		Wolf clonedWolf=(Wolf)wolf.createClone();
		
		System.out.println("Original Wolf object hashcode : "+wolf.hashCode());
		System.out.println("Cloned Wolf object hashcode : "+clonedWolf.hashCode());
				
	}	
   }
  
  
  
  
