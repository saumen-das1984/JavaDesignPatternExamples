package visitors.design.pattern.example;



  public class NetgearRouter implements Router{
	@Override
	public void sendPacket(byte[] data) {
		//Netgear specific
	}
	@Override
	public void recievePacket(byte[] data) {
		//Netgear specific
	}	
	@Override
	public void accept(RouterVisitor v) {
		v.visit(this);
	}
  }

  
  
  
  
  
  
