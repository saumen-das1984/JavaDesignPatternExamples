package builder.design.pattern.example;

public class XMLDocBuilder extends DocBuilder {

	private XMLDocument xmlDocument;

	@Override
	public void createDocument() {
		this.xmlDocument = new XMLDocument();

	}

	@Override
	public void createText() {
		System.out.println("Creating Text for XML Document");

	}

	@Override
	public void createImages() {
		System.out.println("Creating Images for XML Document");

	}

	@Override
	public Document getDocument() {
		System.out.println("Fetching XML Document");
		return this.xmlDocument;
	}

}
