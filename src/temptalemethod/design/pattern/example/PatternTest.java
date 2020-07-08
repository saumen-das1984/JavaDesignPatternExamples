package temptalemethod.design.pattern.example;

public class PatternTest {

	public static void main(String[] args) {	
     Generalization general=new SpecializationOne();
     general.algorithm();
     general=new SpecializationTwo();
     general.algorithm();		
	}
}
