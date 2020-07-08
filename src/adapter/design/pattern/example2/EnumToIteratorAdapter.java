package adapter.design.pattern.example2;

import java.util.Enumeration;
import java.util.Iterator;

  public class EnumToIteratorAdapter implements Iterator<String>
  {
	Enumeration<String> enumeration; 
	public EnumToIteratorAdapter(Enumeration<String> e){
		enumeration= e;
	} 
	public boolean hasNext(){
		return enumeration.hasMoreElements();
	} 
	public String next(){
		return enumeration.nextElement();
	} 
	public void remove(){
		throw new UnsupportedOperationException();
	}
  }
  
  
  
  
  
  


