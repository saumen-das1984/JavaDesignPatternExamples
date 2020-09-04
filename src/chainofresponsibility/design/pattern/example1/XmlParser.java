package chainofresponsibility.design.pattern.example1;

    public class XmlParser extends Parser {	      	
    	@Override
	    public void parse(String fileName) {
	    if ( canHandleFile(fileName, ".xml")){
	    	System.out.println(fileName+" parsed by Xml Parser");
	    }
	    else{
	      super.parse(fileName);
	    }
	  }
	}
    
    
    
    
    
    