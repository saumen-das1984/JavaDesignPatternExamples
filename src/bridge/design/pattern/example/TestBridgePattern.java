package bridge.design.pattern.example;

  public class TestBridgePattern {	
	public static void main(String args){
		PersistenceMechanism xmlPersistence=new XMLFilePersistence();
		ConcretePersistence persistence1=new ConcretePersistence(xmlPersistence);
		
		PersistenceMechanism dbPersistence=new DatabasePersistence();
		ConcretePersistence persistence2=new ConcretePersistence(dbPersistence);
		
		PersistenceMechanism filePersistence=new PlainFilePersistence();
		ConcretePersistence persistence3=new ConcretePersistence(filePersistence);			
	}
   }


