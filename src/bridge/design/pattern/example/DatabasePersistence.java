package bridge.design.pattern.example;

  public class DatabasePersistence implements PersistenceMechanism{
	@Override
	public void saveObject(Object object) {
		//code to persist to database
	}
	@Override
	public Object getObject(String key) {
		//code to retrieve object from database
		return null;
	}
	@Override
	public void deleteObject(String key) {
		//code to delete object from database		
	}
	public void updateObject(Object object){
		//code to update object in database
	}
   }
  
  
  
  
  


