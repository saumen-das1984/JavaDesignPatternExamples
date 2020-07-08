package factory.design.pattern.example;

import java.util.ArrayList;
import java.util.Date;

  public class TravelFacade
  {
   private HotelBooker bookHotel;
   private FlightBooker bookFlight; 
   
   TravelFacade(){
	this.bookHotel=new HotelBooker();
	this.bookFlight=new FlightBooker();
   }

   public ArrayList<String> getFlightsAndHotels(String source,String destination,Date date)
    {
	     System.out.println("Searching  Flights from "+source+ " to "+destination+" on "+date );
         ArrayList<Flight> flights = bookFlight.getFlights(source,destination,date);
         System.out.println("Searching Hotels availability in "+destination+" on "+date);
         ArrayList<Hotel> hotels = bookHotel.getHotelNames(destination,date);
         
         //process and return
         return null;
        
    }
   }
  
  
  
  
  
  

  
  

