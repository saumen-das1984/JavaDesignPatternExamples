package documentproblemstatement.design.pattern.example;

public class TestClass {
	
	public static void main(String... args){
		Employee alex=new Employee("Alex Edger","Intern",20000);
		Employee matt=new Employee("Matt Gustowki","Web Developer",30000);
		Employee joseph=new Employee("Joseph Howe","Web Designer",25000);
		Employee john=new Employee("John Wooden","Trainee",15000);
		
		System.out.println("Alex`s Total Pay : "+alex.getPay());
		System.out.println("Matt`s Total Pay : "+matt.getPay());
		System.out.println("Joseph`s Total Pay : "+joseph.getPay());
		System.out.println("John`s Total Pay : "+john.getPay());
	}

}
