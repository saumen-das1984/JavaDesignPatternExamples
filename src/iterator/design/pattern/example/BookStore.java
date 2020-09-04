package iterator.design.pattern.example;


import java.util.ArrayList;
import java.util.List;

 public class BookStore {
	private List<Book> books;	
	public Iterator iterator() {
		return new BookIterator();
	}
	BookStore(){
		books=new ArrayList<Book>();
	}
	public void addBook(Book book){
		books.add(book);
	}
	class BookIterator implements Iterator {
		int currentIndex = 0;
		@Override
		public boolean hasNext() {
			if (currentIndex >= books.size()) {
				return false;
			} else {
				return true;
			}
		}
		@Override
		public Book next() {
			return books.get(currentIndex++);
		}
		@Override
		public void remove() {
			books.remove(--currentIndex);
		}
	}
  }
 
 
