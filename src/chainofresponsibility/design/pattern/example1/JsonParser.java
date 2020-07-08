package chainofresponsibility.design.pattern.example1;

    public class JsonParser extends Parser {	   
	  @Override
	  public void parse(String fileName) {
	    if ( canHandleFile(fileName, ".json")){
	    	System.out.println(fileName+" parsed by Json Parser");
	    }
	    else{
	      super.parse(fileName);
	    }
	  }
	}
    
    
    
    
    