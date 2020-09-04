package adapter.design.pattern.example2;

import java.util.Enumeration;
import java.util.Vector;

  public class ClientCode {	
	Vector<String> vector = new Vector<String>();	
	ClientCode(){
		 vector.add("Sunday"); vector.add("Monday"); vector.add("Tuesday");
		 vector.add("Wednesday"); vector.add("Thursday"); vector.add("Friday");
		 vector.add("Saturday"); 
	}	
	public Enumeration<String> getDays(){
		Enumeration<String> days= vector.elements();
		return days;
	}  
	
	public void display(){
		//below code will not work as listNode() expects Iterator
		//new XNode().listNode(vector.elements());
	}
  }

  
  
  
  
  