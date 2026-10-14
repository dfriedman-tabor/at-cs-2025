package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleDrawer {
	
	boolean circleMode = true;
	
	ArrayList<Point> locations = new ArrayList<Point>();
	
	public CircleDrawer() {
		
		JFrame window = new JFrame("circle drawer");
		
		window.setSize(600, 677);
		
		JPanel container = new JPanel();
		container.setPreferredSize(new Dimension(600, 650));
		
		window.add(container);
		
		JPanel canvas = new JPanel() {
			
			public void paint(Graphics g) {
				g.setColor(Color.blue);
				
				if (circleMode) {
					for (Point p : locations)
						g.fillOval(p.x, p.y, 50,50);
				}
				else {
					for (Point p : locations)
						g.fillRect(p.x, p.y, 50,50);
				}
				
			}
		};
		
		canvas.setPreferredSize(new Dimension(600, 600));
		container.add(canvas);
		
		JButton b = new JButton("Change Shape");
		b.setPreferredSize(new Dimension(600, 50));
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				circleMode = ! circleMode;
				canvas.repaint();
			}
		});
		
		canvas.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {
				
				locations.add(new Point(e.getX(), e.getY()));
				
				canvas.repaint();

			}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
			
		});
		
		container.add(b);
		
		
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	


	public static void main(String[] args) {
		new CircleDrawer();
	}

}
