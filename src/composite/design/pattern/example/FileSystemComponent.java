package composite.design.pattern.example ;

  public abstract class FileSystemComponent {
	  String name;	  
	  FileSystemComponent(String name){
		  this.name=name;
	  }	  
	  String getName(){
		  return name;
	  }	  
	  public abstract void add(FileSystemComponent component);	
	  public abstract long getSize();
	  
  }

  
  
  