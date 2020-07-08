package singleton.design.pattern.example;

class Singleton
{
	private static Singleton instance=new Singleton();
	private Singleton()	{}
	
	public static Singleton getInstance()
	{	
		return instance;
	}
	
	public void operationOnInstance()
	{
		
	}
 }
 
 
 