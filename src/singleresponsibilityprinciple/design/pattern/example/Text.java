package singleresponsibilityprinciple.design.pattern.example;

public class Text {

	String text;
	String author;
	int length;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	/* methods that change the text */
	void allLettersToUpperCase() {
		System.out.println("All letters are converted to Upper Case");
	}

	void findSubTextAndDelete(String s) {
		System.out.println("Text Deleted");
	}

}
