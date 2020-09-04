package flyweight.design.pattern.example1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

  public class FlyweightPatternTest extends JFrame{	  	  
	    private static final long serialVersionUID = 1L;

		private static final int WINDOW_WIDTH=400,
	                            WINDOW_HEIGHT=500,
	                           NUMBER_OF_LINES=1000000;	    
	    private static final Color colors[] = { Color.green, Color.blue,
            Color.yellow, Color.orange,
            Color.red,Color.white };
	    
	   public FlyweightPatternTest() {
	      Container contentPane = getContentPane();
	      contentPane.setLayout(new BorderLayout());
	      
	      JButton button = new JButton("Press to Draw Lines");
	      
	      final JPanel  panel  = new JPanel();
	      
	      contentPane.add(panel,  BorderLayout.CENTER);
	      contentPane.add(button, BorderLayout.SOUTH);
	      setBounds(450,100,WINDOW_WIDTH,WINDOW_HEIGHT);  
	      
	      button.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent event) {
	        	 Graphics g = panel.getGraphics();
	        	 long start=System.currentTimeMillis();
	             for(int i=0; i < NUMBER_OF_LINES; ++i) {
	                Line line = LineFactory.getLine(getRandomColor());
	                line.draw(g, getRandomX(), getRandomY(), 
	                             getRandomX(), getRandomY());
	             }
	             long end=System.currentTimeMillis();
	             System.out.println("Total Time took : "+(end-start));
	         }
	      });
	   }
	   	   
		@SuppressWarnings("deprecation")
	   public static void main(String[] args) {
	      FlyweightPatternTest test = new FlyweightPatternTest();
	      test.show();
	     }
	     	     
	   private int getRandomX() {
	      return (int)(Math.random()*WINDOW_WIDTH);
	   }
	   	   
	   private int getRandomY() {
	      return (int)(Math.random()*WINDOW_HEIGHT);
	   }
	   	   
	   private Color getRandomColor() {
		   int index=(int)(Math.random()*colors.length);
	      return colors[index];
	   }
  }	
  
  
  
  
  
  