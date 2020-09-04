package visitors.design.pattern.example;

  public class TestVisitorPattern 
  {	
	public static void main(String args[]){
		WindowsConfigurator windows=new WindowsConfigurator();
		UbuntuConfigurator ubuntu=new UbuntuConfigurator();
		
		BelkinRouter belkin=new BelkinRouter();
		NetgearRouter netgear=new NetgearRouter();
		CiscoRouter cisco=new CiscoRouter();	
		
		belkin.accept(windows);
		belkin.accept(ubuntu);	
		
		netgear.accept(windows);
		netgear.accept(ubuntu);
		
		cisco.accept(windows);
		cisco.accept(ubuntu);
	}
 }
  
  
