package flyweight.design.pattern.example2;

  public class Digit {
     private int number;
     Digit(int number){
    	 this.number=number;
     }
     public int getNumber(){
    	 return number;
     }     
     public void placeDigit(int row,int column){
    	 System.out.println("["+row+"] "+"["+column+"] ");
     }
  }
  
  
  
  
