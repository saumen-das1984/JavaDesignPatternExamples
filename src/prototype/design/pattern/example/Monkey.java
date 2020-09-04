package prototype.design.pattern.example;

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
  
  
  
  
