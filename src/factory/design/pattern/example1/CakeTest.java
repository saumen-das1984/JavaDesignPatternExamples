package factory.design.pattern.example1;

import java.util.Scanner;

  public class CakeTest {

    public static void main(String args[]) {

	Cake cake = null;
			
	System.out.println("Which Cake you would like to eat : BlackForest/BlueBerry/LitchiGateaux/Pineapple");
	Scanner scanner = new Scanner(System.in);
	String choice = scanner.nextLine();
	scanner.close();

	Factory factory=new CakeFactory();
	cake=factory.createCake(choice);
		
	cake.aboutCake();
	
	}

   }