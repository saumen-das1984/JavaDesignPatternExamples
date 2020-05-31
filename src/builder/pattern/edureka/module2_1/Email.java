package builder.pattern.edureka.module2_1;

import java.io.File;

  public class Email {
    private String from;
    private String to;
    private String subject;
    private String body;
    private File attachment;
    private String mimeType; 
	
	public void setFrom(String from) {
		this.from = from;
	}	
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public String getSubject() {
		return subject;
	}
	public String getBody() {
		return body;
	}
	public File getAttachment() {
		return attachment;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setTo(String to) {
		this.to = to;
	}	
	public void setSubject(String subject) {
		this.subject = subject;
	}	
	public void setBody(String body) {
		this.body = body;
	}	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}	
	public void setAttachment(File file){
		attachment=file;
	}   
  }

  
  
