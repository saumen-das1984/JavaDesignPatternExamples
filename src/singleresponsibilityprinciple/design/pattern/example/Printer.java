package singleresponsibilityprinciple.design.pattern.example;

public class Printer {
	Text text;

	Printer(Text t) {
		this.text = t;
	}

	void printText() {
		System.out.println("Text are printed");
	}

}
