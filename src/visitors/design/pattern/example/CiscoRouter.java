package visitors.design.pattern.example;



  public class CiscoRouter implements Router{
	@Override
	public void sendPacket(byte[] data) {
		//Cisco specific
	}
	@Override
	public void recievePacket(byte[] data) {
		//Cisco specific
	}	
	@Override
	public void accept(RouterVisitor v) {
		v.visit(this);
	}
  }

  
  