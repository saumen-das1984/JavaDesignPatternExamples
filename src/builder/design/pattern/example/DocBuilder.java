package builder.design.pattern.example;

public abstract class DocBuilder {
	public abstract void createDocument();

	public abstract void createText();

	public abstract void createImages();

	public abstract Document getDocument();
}
