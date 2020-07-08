  package strategy.design.pattern.example2;
  
  public class Employee {
	private String empName;
	private Designation designation;		
	PayAlgorithm payAlgorithm;	
	
	Employee(String empName,Designation designation){
		this.empName=empName;
		this.designation=designation;		
	}
	public String getEmpName() {
		return empName;
	}	
	public double getPay() {
		if(payAlgorithm == null){
			return designation.getPayAlgorithm().getPay(designation.getBasicSalary());
		}else{
			return payAlgorithm.getPay(designation.getBasicSalary());
		}		
	}	
	public void setPayAlgorithm(PayAlgorithm payAlgorithm){
		this.payAlgorithm=payAlgorithm;
	}	
  }
  
  
  
  
