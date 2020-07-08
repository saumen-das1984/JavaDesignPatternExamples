package prototype.design.pattern.example;

   public class Wolf implements Animal{

	@Override
	public Animal createClone() {		
      Wolf wolf = null;		
		try {			
			 wolf = (Wolf)super.clone();
			 //You can write your own specific clone code
		    }	
		catch (CloneNotSupportedException e) {			
			e.printStackTrace();			  
		 }		
		return wolf;
	 }
   }

   
   