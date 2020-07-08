package observer.design.pattern.example;

   public interface Observable {	   
	public void addObserver(WeatherObserver weatherObserver);
	public void removeObserver(WeatherObserver weatherObserver);
	public void doNotify();		
   }
   
   
   

   
   