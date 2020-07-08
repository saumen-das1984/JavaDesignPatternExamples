package proxy.design.pattern.example;



  public class ActualVideo implements Video {	
		  
	ActualVideo(String videoName){
		loadVideo(videoName);
	}	
	private void loadVideo(String videoName) {
		//Fetch the video	
	}
	@Override
	public void playVideo() {
		//Play video
	}
   }

  
  
  
  
  
  