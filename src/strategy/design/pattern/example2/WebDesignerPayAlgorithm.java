

  package strategy.design.pattern.example2;

  
  
  
  
  public class WebDesignerPayAlgorithm implements PayAlgorithm
  {
	public double getPay(double basicSalary){
		return basicSalary+(basicSalary * .15);
	}	
  }
  
  
  
  
  
  
  
  
  
  
  
