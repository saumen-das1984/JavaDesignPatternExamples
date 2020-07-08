package strategy.design.pattern.example2;

  public class Designation {	
	private String designation;
	PayAlgorithm payAlgorithm;
	private double basicSalary;
	Designation(String designation,PayAlgorithm payAlgorithm,double basicSalary){
		this.designation=designation;
		this.payAlgorithm=payAlgorithm;
		this.basicSalary=basicSalary;
	}
	public String getDesignation() {
		return designation;
	}
	public PayAlgorithm getPayAlgorithm() {
		return payAlgorithm;
	}
	public double getBasicSalary() {
		return basicSalary;
	}	
  }
  
  
  


