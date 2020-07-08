

  package documentproblemstatement.design.pattern.example;
  
  public class Employee {
	private String empName;
	private String employeeType;
	private double basicSalary;		
	Employee(String empName,String employeeType,double basicSalary){
		this.empName=empName;
		this.employeeType=employeeType;
		this.basicSalary=basicSalary;		
	}		
	public String getEmpName() {
		return empName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}	
	public String getEmployeeType() {
		return employeeType;
	}
	
	 public double getPay() {
		double pay=0.0;
		if (this.getEmployeeType().equals("Intern")) {
			pay = basicSalary + (basicSalary * .10);
		}else if (this.getEmployeeType().equals("Web Developer")) {
        	pay = basicSalary + (basicSalary * .20);
		}else if (this.getEmployeeType().equals("Trainee")) {
        	pay = basicSalary + (basicSalary * .12);
		}else if (this.getEmployeeType().equals("Web Designer")) {
        	pay = basicSalary + (basicSalary * .15);
		}
		return pay;
	  }
	 
	 
	 
	 
	 
	 

   }
  
  
