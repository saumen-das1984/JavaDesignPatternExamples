package builder.design.pattern.example;

public class PDFDocBuilder extends DocBuilder {

	private PDFDocument pdfDocument;

	@Override
	public void createDocument() {
		this.pdfDocument = new PDFDocument();

	}

	@Override
	public void createText() {
		System.out.println("Creating Text for PDF Document");

	}

	@Override
	public void createImages() {
		System.out.println("Creating Images for PDF Document");

	}

	@Override
	public Document getDocument() {
		System.out.println("Fetching PDF Document");
		return this.pdfDocument;
	}

}
