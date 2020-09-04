package builder.pattern.edureka.module2;

  public class Pizza { 
	 private String dough = "";
	 private String cheese = "";
	 private String topping = "";
	 
	Pizza(){
		this.dough="plain dough";
		this.cheese="plain cheese";
		this.topping="plain topping";
	}
	
	Pizza(String dough){
		this.dough=dough;
	}
	Pizza(String dough,String cheese){
		this.dough=dough;
		this.cheese=cheese;
	}
	Pizza(String dough,String cheese,String topping){
		this.dough=dough;
		this.cheese=cheese;
		this.topping=topping;
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}	 
  }
  
  
 
 
