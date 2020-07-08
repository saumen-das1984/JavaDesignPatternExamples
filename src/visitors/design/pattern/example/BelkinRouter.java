package visitors.design.pattern.example;



  public class BelkinRouter implements Router{
	@Override
	public void sendPacket(byte[] data) {
		//belkin specific
	}
	@Override
	public void recievePacket(byte[] data) {
		//belkin specific
	}
	@Override
	public void accept(RouterVisitor v) {
		v.visit(this);
	}
  }
  
  
  
  
  
  
  


