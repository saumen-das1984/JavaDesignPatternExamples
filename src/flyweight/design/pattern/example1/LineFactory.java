package flyweight.design.pattern.example1;

import java.util.HashMap;
import java.awt.Color;


  public class LineFactory {	
   private static final HashMap<Color,Line> lineMap = new HashMap<Color,Line>();   
   public static Line getLine(Color color) {
      Line line = (Line)lineMap.get(color);
      if(line == null) {
         line = new Line(color);
         lineMap.put(color, line);
         System.out.println("Creating " + color + " line");
      }
      return line;
    }
  }
  
  
  
 
 
 
 
 
 


