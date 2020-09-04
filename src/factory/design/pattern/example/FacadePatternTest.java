package factory.design.pattern.example;

import java.util.Calendar;

  public class FacadePatternTest
  {
   public static void main(String[] args)
   {
        TravelFacade facade = new TravelFacade(); 
        Calendar c=Calendar.getInstance();
        c.set(2015,2,15,4,0);
        facade.getFlightsAndHotels("Melbourne","Sydney",c.getTime());
   }
  }
  
  
  
  