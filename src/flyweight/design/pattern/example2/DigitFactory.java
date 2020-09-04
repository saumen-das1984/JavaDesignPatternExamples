package flyweight.design.pattern.example2;

import java.util.HashMap;

   public class DigitFactory {
	private static final HashMap<Integer,Digit> digitMap=new HashMap<Integer,Digit>();
    public static Digit getDigit(int number){    	
    	Digit digit=(Digit)digitMap.get(number);
    	if(digit==null){
    		digit=new Digit(number);
    		digitMap.put(number,digit);
    		System.out.println("Creating Digit "+number);
    	}    	
    	return digit;    	
    }
   }

   
   