package observer.design.pattern.example;

  public class ObserverTest {
    public static void main(String[] args) {		
    	WeatherStation weatherStation = new WeatherStation(33);		
		TVChannel observer1 = new TVChannel();
		Newspapers observer2 = new Newspapers();
		
		weatherStation.addObserver(observer1);
		weatherStation.addObserver(observer2);		
		weatherStation.setTemperature(30);			
		weatherStation.removeObserver(observer1);
		
		weatherStation.setTemperature(35);
	}
  }
  
  
  
  
  
  
  
  
