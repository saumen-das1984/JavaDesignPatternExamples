package chainofresponsibility.design.pattern.example1;

  public abstract class Parser {  
   private Parser successor;  
   public void parse(String fileName){
    if ( getSuccessor() != null ){
      getSuccessor().parse(fileName);
    }
    else{
      System.out.println("Can not parse "+fileName.substring(fileName.lastIndexOf("."))+" file");
    }
   }  
   protected boolean canHandleFile(String fileName, String format){
    return fileName.endsWith(format);        
   }
   Parser getSuccessor() {
    return successor;
   }
   void setSuccessor(Parser successor) {
    this.successor = successor;
   }
  }
  
  
  
  
  