package prototype.design.pattern.edureka.module2;

  public class Monkey implements Animal{		  
	@Override
	public Animal createClone() {		
      Monkey monkey = null;		
		try {			
			 monkey = (Monkey)super.clone();	
			 //You can write your own specific clone code
		    }	
		catch (CloneNotSupportedException e) {			
			e.printStackTrace();			  
		 }		
		return monkey;
	 }	
   }
  
  
  
  
