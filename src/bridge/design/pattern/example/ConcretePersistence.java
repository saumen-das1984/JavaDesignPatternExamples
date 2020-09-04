package bridge.design.pattern.example;

  public class ConcretePersistence extends Persistence {
	public ConcretePersistence(PersistenceMechanism mechanism) {
		super(mechanism);
	}
	@Override
	public void saveObject(Object object) {
		getPersistenceMechanism().saveObject(object);	
	}
	@Override
	public Object getObject(String key) {
		return getPersistenceMechanism().getObject(key);				
	}
	@Override
	public void deleteObject(String key) {		
		getPersistenceMechanism().deleteObject(key);	
	}
  }
  
  
  
