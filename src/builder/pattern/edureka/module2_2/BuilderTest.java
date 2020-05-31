package builder.pattern.edureka.module2_2;

import java.io.File;

  public class BuilderTest {
	public static void main(String args[]){		
		File file=new File("attachment.pdf");		
		Email mail=new Email.EmailBuilder()
		                                  .from("abc@gmail.com")
		                                  .to("xyz@yahoo.com")
		                                  .subject("Builder Pattern")
		                                  .body("your message")
		                                  .attachment(file)
		                                  .mime("application/pdf")		                                  
		                                  .build();
	}	
  }

  
  
  

