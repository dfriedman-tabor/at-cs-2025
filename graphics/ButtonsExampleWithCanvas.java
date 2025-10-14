package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonsExampleWithCanvas {
	
	final int WIDTH = 800, HEIGHT = 800;
	
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public ButtonsExampleWithCanvas() {
		
		JFrame window = new JFrame();
		window.setSize(WIDTH,HEIGHT);
		
		
		JPanel mainContainer = new JPanel();
		
		BoxLayout boxlayout = new BoxLayout(mainContainer, BoxLayout.Y_AXIS);
		mainContainer.setLayout(boxlayout);
		
		window.add(mainContainer);
		
		JPanel row1 = new JPanel();
		mainContainer.add(row1);
		
		JButton rectButton = new JButton("Rectangle");
		rectButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("rect pressed");
				
			}
			
		});
		row1.add(rectButton);
		JButton circButton = new JButton("Circle");
		row1.add(circButton);
		
		JPanel row2 = new JPanel();
		mainContainer.add(row2);
		
		JButton triButton = new JButton("triangle");
		row2.add(triButton);
		JButton textButton = new JButton("text");
		row2.add(textButton);
		
		
		JPanel canvas = new JPanel() {
			
			public void paint(Graphics g) {
				g.setColor(Color.white);
				g.fillRect(0, 0, ButtonsExampleWithCanvas.this.WIDTH, ButtonsExampleWithCanvas.this.HEIGHT/2);
				
				for (Shape s : shapes) {
					s.draw(g);
				}
			}
		};
		canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT/2));
		mainContainer.add(canvas);
		
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new ButtonsExampleWithCanvas();
	}

}
