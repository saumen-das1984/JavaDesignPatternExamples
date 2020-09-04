package bridge.design.pattern.example;

  public interface PersistenceMechanism {	
	void saveObject(Object object);
	Object getObject(String key);
	void deleteObject(String key);
  }
  
  
  
  
