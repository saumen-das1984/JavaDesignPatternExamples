package chainofresponsibility.design.pattern.example1;

public class CsvParser extends Parser {
	  
	  @Override
	  public void parse(String fileName) {
	    if ( canHandleFile(fileName, ".csv")){
	      System.out.println(fileName+" parsed by CSV Parser");
	    }
	    else{
	      super.parse(fileName);
	    }
	  }

	}