package chainofresponsibility.design.pattern.example;

  public class TestCOR {
    public static void main(String[] args)
    {     	
    	Support l1Support=new L1Support();
        Support l2Support=new L2Support();
    	Support l3Support=new L3Support();
    	Support l4Support=new L4Support();        	
    	l1Support.setHandler(l2Support);
    	l2Support.setHandler(l3Support);
    	l3Support.setHandler(l4Support);    	
    	SupportRequest request = new SupportRequest("how to run the project");      
        l1Support.handleRequest(request);
        System.out.println(request.getStatus());     
 
        request = new SupportRequest("what is the fee");     
        l1Support.handleRequest(request);
        System.out.println(request.getStatus());      
    }
  }
  
  
  
  
  
  