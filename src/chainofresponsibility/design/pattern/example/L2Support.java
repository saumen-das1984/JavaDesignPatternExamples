package chainofresponsibility.design.pattern.example;

import java.util.ArrayList;
import java.util.List;

  public class L2Support extends Support {	
	  List<String> queriesHandled=new ArrayList<String>();
	  L2Support(){
			queriesHandled.add("how to run the project");
			queriesHandled.add("how to create a mapping file");
			queriesHandled.add("what should be installed to run the project");		
		 }
    @Override
    public void handleRequest(SupportRequest request) {
    	boolean handled=false;
    	for(String question:queriesHandled){
    		if(question.equals(request.getQuery())){
    			request.setStatus("L2 Support solved level two reuqest ");
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
  
  
  
 
 
 
  
 
 
 
 