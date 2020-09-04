package observer.design.pattern.example;

 public class TVChannel implements WeatherObserver{
	@Override
	public void doUpdate(int temperature) {
	System.out.println("TV Channel updating temperature to "+temperature);
	}
 }
 
 
 
