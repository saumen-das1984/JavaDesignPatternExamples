

package adapter.design.pattern.example2.api;
  import java.util.Iterator;  
  public class XNode {	   
	   public void listNode(Iterator<String> iterator){
		   while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	   }
  }

  
  
  