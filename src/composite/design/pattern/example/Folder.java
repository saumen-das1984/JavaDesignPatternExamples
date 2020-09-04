package composite.design.pattern.example;

import java.util.ArrayList;

  public class Folder extends FileSystemComponent{
   ArrayList<FileSystemComponent> fileSystemComponent=new ArrayList<FileSystemComponent>();	
	Folder(String name) {
		super(name);		
	}
	@Override
	public void add(FileSystemComponent component) {
		fileSystemComponent.add(component);
	}
	@Override
	public long getSize() {
		long size=0;
		for(FileSystemComponent component: fileSystemComponent){
			size=size+component.getSize();
		}
		return size;		
	}	
  }
  
  
  
  
  
