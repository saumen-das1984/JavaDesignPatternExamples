package chainofresponsibility.design.pattern.example1;

import java.util.List;
import java.util.ArrayList;

  public class CORTest {	
   public static void main(String[] args) {     
    List<String> fileList = new ArrayList<String>();
    fileList.add("jaxb.xml");
    fileList.add("data.csv");
    fileList.add("resume.doc");
    fileList.add("quizQuestion.txt");
    fileList.add("posts.json"); 
    
    Parser textParser = new TextParser();  
    Parser jsonParser = new JsonParser(); 
    Parser csvParser = new CsvParser();   
    Parser xmlParser = new XmlParser();
    
    textParser.setSuccessor(jsonParser);
    jsonParser.setSuccessor(csvParser);
    csvParser.setSuccessor(xmlParser); 
        
    for ( String fileName : fileList){
      textParser.parse(fileName);
     }    
    }
  }
  
  
  
  
  
  
  
  
  
  
  
  