package bridge.design.pattern.example;

  public class XMLFilePersistence implements PersistenceMechanism{
	@Override
	public void saveObject(Object object) {
		//code to persist to XML file
	}
	@Override
	public Object getObject(String key) {
		//code to retrieve object from XML file
		return null;
	}
	@Override
	public void deleteObject(String key) {
		// code to delete object from XML file		
	}
   }
  
  


