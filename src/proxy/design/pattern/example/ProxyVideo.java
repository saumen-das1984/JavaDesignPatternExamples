package proxy.design.pattern.example;

  public class ProxyVideo implements Video {
	String name;	
	ProxyVideo(String name){
		this.name=name;
	}	 
	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		ActualVideo video=new ActualVideo(name);
		video.playVideo();
	}
   }
  
  
  
  
 
 
 
 
 
