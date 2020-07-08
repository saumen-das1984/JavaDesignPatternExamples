package flyweight.design.pattern.example2;

import java.util.Random;

  public class FlyweightPatternTest {	
	public static void main(String args[]){		
		for(int i=0;i<9;i++){			
			for(int j=0;j<9;j++){
			Digit number=DigitFactory.getDigit(getRandomNumber());	
			number.placeDigit(getRandomRow(), getRandomColumn());
			}
		}		
	}	
	public static int getRandomRow(){
		return (int)(Math.random()*9 );
	}	
	public static int getRandomColumn(){
		return (int)(Math.random()*9 );
	}
	public static int getRandomNumber(){
		Random random =new Random();
		int lowerLimit=1;
		int upperLimit=10;
		return random.nextInt(upperLimit-lowerLimit)+lowerLimit;
	}
  }

  
  