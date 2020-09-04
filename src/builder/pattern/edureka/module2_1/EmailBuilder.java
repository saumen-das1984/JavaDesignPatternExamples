package builder.pattern.edureka.module2_1;

import java.io.File;

  public class EmailBuilder {
	private Email email=new Email();	
	public EmailBuilder from(String from){
		email.setFrom(from);
		return this;
	}	
	public EmailBuilder to(String to){
		email.setTo(to);
		return this;
	}
	public EmailBuilder mime(String mimeType){
		email.setMimeType(mimeType);
		return this;
	}
	public EmailBuilder subject(String subject){
		email.setSubject(subject);
		return this;
	}	
	public EmailBuilder body(String body){
		email.setBody(body);
		return this;
	}	
	public EmailBuilder attachment(File file){
		email.setAttachment(file);
		return this;
	}	
	Email build(){
		return email;
	}
   
  
  
	
	/*
	public Email build() {
	    assert email.getFrom() != null;
	    assert email.getTo() != null;
	    assert email.getSubject() != null;
	    assert email.getBody() != null;
	    return email;
	}
	*/
	
	
	
  }

  
  
  
  

