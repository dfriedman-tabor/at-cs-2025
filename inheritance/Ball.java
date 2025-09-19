package inheritance;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	int x, y, speedx, speedy, size;
	Color color;
	
	public Ball(int x, int y, int size, int speedx, int speedy, Color c) {
		this.x = x;
		this.y = y;
		this.speedx = speedx;
		this.speedy = speedy;
		color = c;
		this.size = size;
	}
	
	public void move() {
		x += speedx;
		y += speedy;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, size, size);
	}
	
}
