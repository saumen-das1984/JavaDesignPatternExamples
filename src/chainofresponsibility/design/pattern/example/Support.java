package chainofresponsibility.design.pattern.example;

  public abstract class Support
  {
	protected Support nextSupport;
    public abstract void handleRequest(SupportRequest request);
    public void setHandler(Support handler) {
        nextSupport = handler;
    } 
  }
  
  
  
 
 
 
 


