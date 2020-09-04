package strategy.design.pattern.example2;

  public class TestStrategy {	
	public static void main(String... args){
		
		InternPayAlgorithm internPayAlgorithm =new InternPayAlgorithm();
		WebDeveloperPayAlgorithm webDeveloperPayAlgorithm=new WebDeveloperPayAlgorithm();
		TraineePayAlgorithm traineePayAlgorithm=new TraineePayAlgorithm();
		WebDesignerPayAlgorithm webDesignerPayAlgorithm=new WebDesignerPayAlgorithm();
		
		Designation intern=new Designation("Intern",internPayAlgorithm,20000);
		Designation developer=new Designation("Web Developer",webDeveloperPayAlgorithm,35000);
		Designation designer=new Designation("Web Designer",webDesignerPayAlgorithm,30000);
		Designation trainee=new Designation("Trainee",traineePayAlgorithm,25000);		
		
		Employee alex=new Employee("Alex Edger",intern);
		Employee matt=new Employee("Matt Gustowki",developer);
		Employee joseph=new Employee("Joseph Howe",designer);
		Employee john=new Employee("John Wooden",trainee);	
		
		System.out.println("Alex`s Total Pay : "+alex.getPay());
		System.out.println("Matt`s Total Pay : "+matt.getPay());
		System.out.println("Joseph`s Total Pay : "+joseph.getPay());
		System.out.println("John`s Total Pay : "+john.getPay());	
		
		alex.setPayAlgorithm(traineePayAlgorithm);
		System.out.println("Alex`s Total Pay : "+alex.getPay());
	}
  }
  
  
  
  
  
  
  
  
  
  
