package visitors.design.pattern.example;

public class WindowsConfigurator implements RouterVisitor{
	@Override
	public void visit(BelkinRouter router) {
		System.out.println("BelkinRouter Configuration for Windows !!");
	}
	@Override
	public void visit(NetgearRouter router) {
		System.out.println("NetgearRouter Configuration for Windows !!");
	}
	@Override
	public void visit(CiscoRouter router) {
		System.out.println("CiscoRouter Configuration for Windows !!");
	}
   }
   
   
   
