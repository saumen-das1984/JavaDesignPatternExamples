package chainofresponsibility.design.pattern.example1;

    public class TextParser extends Parser{	  	  
	  @Override
	  public void parse(String fileName) {
	    if ( canHandleFile(fileName, ".txt")){
	    	System.out.println(fileName+" parsed by Text Parser");
	    }
	    else{
	      super.parse(fileName);
	    }	    
	  }
	}
    
    
    
    
    