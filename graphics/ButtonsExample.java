package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonsExample {
	
	public ButtonsExample() {
		
		JFrame window = new JFrame();
		window.setSize(800,800);
		
		
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
		
		
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new ButtonsExample();
	}

}
