package bridge.design.pattern.example;

   public class PlainFilePersistence implements PersistenceMechanism{
	@Override
	public void saveObject(Object object) {
		//code to persist to simple text file
	}
	@Override
	public Object getObject(String key) {
		//code to retrieve object from text file
		return null;
	}
	@Override
	public void deleteObject(String key) {
		// code to delete object from text file		
	}
   }
   
   
   


