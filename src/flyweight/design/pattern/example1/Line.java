package flyweight.design.pattern.example1;

   import java.awt.*;
   public class Line {
   private Color color;
   public Line(Color color) {
      this.color = color;
   }
   public void draw(Graphics g, int x, int y, int x2, int y2) {
      g.setColor(color);
      g.drawLine(x, y, x2, y2);
   }
  }
   
   
   
   
   
   