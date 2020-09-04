package adapter.design.pattern.example2;

import adapter.design.pattern.example2.api.XNode;

public class TestAdapter {

	public static void main(String[] args) {
		
		
	  ClientCode code=new ClientCode();
	  EnumToIteratorAdapter enumToIterator=new EnumToIteratorAdapter(code.getDays());
	  new XNode().listNode(enumToIterator);
	  
	  
	  
	}

}
