package composite.design.pattern.example;

  public class TestCompositePattern {
	public static void main(String args[]){
		FileSystemComponent movieSubtitles=new File("movie.srt",800);		
		FileSystemComponent actionMovie1=new File("BourneUltimatum.mp4",3036000);
		FileSystemComponent actionMovie2=new File("LoneSurvivor.mp4",4096000);
		
		FileSystemComponent moviesFolder=new Folder("Movies");		
		FileSystemComponent actionMoviesFolder=new Folder("Action Movies");
		actionMoviesFolder.add(actionMovie1);
		actionMoviesFolder.add(actionMovie2);
		
		FileSystemComponent newMovie=new File("A-Walk-To-Remember.mp4",2048000);
		
		moviesFolder.add(actionMoviesFolder);
		moviesFolder.add(newMovie);
		moviesFolder.add(movieSubtitles);
		
		System.out.println("Movie Folder Size : "+moviesFolder.getSize());		
	}	
  }
  
  
  
  
  
  
