package iterator.design.pattern.example;

 public class Book {	
	private String name;
	private int price;
	private String author;
	private String publisher;	
	public Book(String name,int price,String author,String publisher){
		this.name=name;
		this.price=price;
		this.author=author;
		this.publisher=publisher;
	}	
	public String toString(){
	 return name+", "+price+", "+author+", "+publisher;	
     }
 }
 
 
