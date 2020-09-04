package observer.design.pattern.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 public class WeatherStation implements Observable{	
	List<WeatherObserver> weatherObservers;	
	int temperature;
	public WeatherStation(int temperature) {
		weatherObservers = new ArrayList<WeatherObserver>();
		this.temperature = temperature;
	}
	@Override
	public void addObserver(WeatherObserver weatherObserver) {
		weatherObservers.add(weatherObserver);
	}
	@Override
	public void removeObserver(WeatherObserver weatherObserver) {
		weatherObservers.remove(weatherObserver);
	}
	@Override
	public void doNotify() {
		Iterator<WeatherObserver> it = weatherObservers.iterator();
		while (it.hasNext()) {
			WeatherObserver weatherObserver = it.next();
			weatherObserver.doUpdate(temperature);
		}
	}
	public void setTemperature(int newTemperature) {
		System.out.println("WeatherStation updating temperature to " + newTemperature);
		temperature = newTemperature;
		doNotify();
	}
  }
 
 
 
 
 
 
