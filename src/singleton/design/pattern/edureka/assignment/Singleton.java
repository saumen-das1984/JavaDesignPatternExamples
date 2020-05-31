package singleton.design.pattern.edureka.assignment;

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
 
 
 