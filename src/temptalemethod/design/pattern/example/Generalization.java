package temptalemethod.design.pattern.example;

 abstract class Generalization {	 
	 public final void algorithm() {
	  firstStep();
	  secondStep();
	  thirdStep();
	  lastStep();
	 }	
	 protected void firstStep() 
	 { System.out.println("Hook method Subclass can override"); } 	 
	 abstract protected void secondStep();
	 abstract protected void thirdStep();	
	 protected void lastStep() {
	  System.out.println( "Hook method Subclass can override");
	 }
  }
 
 
 
 
 
 
 
 
 