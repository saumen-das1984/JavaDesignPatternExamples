package flyweight.design.pattern.example;

import java.awt.Color;
import java.awt.Graphics;

public interface Shape {
	public void draw(Graphics g, int x, int y, int width, int height,
			Color color, boolean fill, String font);
}
