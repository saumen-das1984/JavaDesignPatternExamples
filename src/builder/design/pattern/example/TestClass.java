package builder.design.pattern.example;

public class TestClass {

	public static void main(String[] args) {
		DocCreationEngine engine = new DocCreationEngine();
		
		PDFDocBuilder pdfBuilder = new PDFDocBuilder();
		engine.generateDocument(pdfBuilder);
		PDFDocument pdfDocument = (PDFDocument) pdfBuilder.getDocument();
		
		XMLDocBuilder xmlBuilder = new XMLDocBuilder();
		engine.generateDocument(xmlBuilder);
		XMLDocument xmlDocument = (XMLDocument) xmlBuilder.getDocument();

	}

}
