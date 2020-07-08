package chainofresponsibility.design.pattern.example;

import java.util.ArrayList;
import java.util.List;

public class L3Support extends Support {	
	  List<String> queriesHandled=new ArrayList<String>();
	  L3Support(){
			queriesHandled.add("can we build our own implementation of code");				
		 }
  @Override
  public void handleRequest(SupportRequest request) {
  	boolean handled=false;
  	for(String question:queriesHandled){
  		if(question.equals(request.getQuery())){
  			request.setStatus("L3 Support solved level three reuqest ");
  			 handled=true;
  		}
  	}       
      if(handled==false)
   {
    if(nextSupport != null){
       nextSupport.handleRequest(request);
     }
     else
     {
     throw new IllegalArgumentException("Can not help");
     }
   }
  }
 }