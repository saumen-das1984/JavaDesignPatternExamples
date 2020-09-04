package builder.pattern.edureka.module2_1;

import java.io.File;

  public class BuilderTest {
	public static void main(String args[]){		
		File file=new File("attachment.pdf");
		Email email=new EmailBuilder()
		                              .from("abc@gmail.com")
		                              .to("xyz@yahoo.com")
		                              .subject("Builder Pattern")
		                              .body("your message")
		                              .attachment(file)
		                              .mime("application/pdf")
		                              .build();
		
		System.out.println(email.getTo());
		
		
	}	
  }


