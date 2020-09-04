package chainofresponsibility.design.pattern.example;

import java.util.ArrayList;
import java.util.List;

   public class L1Support extends Support {
	 List<String> queriesHandled=new ArrayList<String>();
	 L1Support(){
		queriesHandled.add("where can i download the file");
		queriesHandled.add("how much time it will take to learn");
		queriesHandled.add("what is the fee");		
	 }
    @Override
    public void handleRequest(SupportRequest request) {
    	boolean handled=false;
    	for(String question:queriesHandled){
    		if(question.equals(request.getQuery())){
    			 request.setStatus("L1 Support solved level one reuqest ");
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

   
   
 
 
 
 



