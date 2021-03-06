package chainofresponsibility.design.pattern.example;

import java.util.ArrayList;
import java.util.List;

public class L4Support extends Support {	
	  List<String> queriesHandled=new ArrayList<String>();
	  L4Support(){
			queriesHandled.add("i am not able to purchase the course");
			queriesHandled.add("how to pay from debit card");
				
		 }
  @Override
  public void handleRequest(SupportRequest request) {
  	boolean handled=false;
  	for(String question:queriesHandled){
  		if(question.equals(request.getQuery())){
  			request.setStatus("L4 Support solved level four reuqest ");
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