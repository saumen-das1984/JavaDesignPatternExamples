package builder.pattern.edureka.module2_2;

import java.io.File;

  public class Email {
    private String from;
    private String to;
    private String subject;
    private String body;
    private File attachment;
    private String mimeType; 
    //Getters goes here
	public static class EmailBuilder{
		private Email email = new Email();		
		public EmailBuilder from(String from){
			email.from=from;
			return this; }
		public EmailBuilder to(String to){
			email.to=to;
			return this; }
		public EmailBuilder subject(String subject){
			email.subject=subject;
			return this; }
		public EmailBuilder body(String body){
			email.body=body;
			return this; }
		public EmailBuilder attachment(File file){
			email.attachment=file;
			return this; }
		public EmailBuilder mime(String mime){
			email.mimeType=mime;
			return this; }
		public Email build(){
			return email; }        
	}	
  }

  
  
  
  

  
  