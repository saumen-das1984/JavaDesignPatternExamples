package iterator.design.pattern.example;


  public class IteratorTest {
	public static void main(String args[]){
		Book book1=new Book("The Vault",249,"Emiley Mckay","Penguin Books");
		Book book2=new Book("War and Peace",296,"Leo Tolstoy","Penguin Books");
		Book book3=new Book("Johny Gone Down",85,"Karan Bajaj","Harper Coolins");		
		BookStore bookStore=new BookStore();
		bookStore.addBook(book1);
		bookStore.addBook(book2);
		bookStore.addBook(book3);
		
		Iterator iterator=bookStore.iterator();
		while(iterator.hasNext()){
			Book book=(Book)iterator.next();	
			System.out.println(book);
		}		
		iterator.remove();
		
		iterator=bookStore.iterator();
		while(iterator.hasNext()){
			Book book=(Book)iterator.next();	
			System.out.println(book);
		}		
	}	
  }

  
  