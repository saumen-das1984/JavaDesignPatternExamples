package builder.design.pattern.example;

public class DocCreationEngine {
	public void generateDocument(DocBuilder builder) {
		builder.createDocument();
		builder.createText();
		builder.createImages();
	}
}
