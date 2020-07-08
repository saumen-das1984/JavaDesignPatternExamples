package composite.design.pattern.example;

 public class File extends FileSystemComponent {
	private long size;
	File(String name,long size) {
		super(name);
		this.size=size;
	}
	@Override
	public void add(FileSystemComponent component) {
		throw new UnsupportedOperationException();
	}		
	@Override
	public long getSize() {		
		return size;
	}
 }
 
 
 
 
