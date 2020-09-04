package bridge.design.pattern.example1;

  public abstract class Shape {
	protected  Pattern pattern;
	protected String name;
	
	public void draw(){
		System.out.println("Drawing "+this.name+" using "+pattern.getDescription());
	}	
	public void applyPattern(Pattern pattern){
		this.pattern=pattern;	
	}
	public String getName(){
		return name;
	}	
  }

  
  
  
  
  

  
  

