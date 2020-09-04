package bridge.design.pattern.example;

  public abstract class Persistence {	
	private PersistenceMechanism persistenceMechanism;	
	public Persistence(PersistenceMechanism mechanism){
		persistenceMechanism=mechanism;
	}
	
	public abstract void saveObject(Object object);
	public abstract Object getObject(String key);
	public abstract void deleteObject(String key);	
	
	public PersistenceMechanism getPersistenceMechanism(){
		return persistenceMechanism;
	}
  }


