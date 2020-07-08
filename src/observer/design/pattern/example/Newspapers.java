package observer.design.pattern.example;

  public class Newspapers implements WeatherObserver{
	@Override
	public void doUpdate(int temperature) {
	System.out.println("Newspaper updating temperature to "+temperature);
	}
  }
  
  
  
