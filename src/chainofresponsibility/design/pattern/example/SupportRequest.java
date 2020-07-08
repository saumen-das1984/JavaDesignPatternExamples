package chainofresponsibility.design.pattern.example;

  public class SupportRequest {	 
    private String query;
    private String ticketStatus = null;
    SupportRequest(String query){
    	this.query=query;
    }     
    public String getStatus() {
        return ticketStatus;
    }
    public void setStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
    public String getQuery(){
    	return query;
    }
  }
  
  
  
  