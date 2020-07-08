package visitors.design.pattern.example;


  public interface Router 
  {
	public void sendPacket(byte[] data);
	public void recievePacket(byte[] data);	
	public void accept(RouterVisitor v);
  }
  
  
  
  
  
  
  
