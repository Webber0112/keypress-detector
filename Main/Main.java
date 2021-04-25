package Main;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame{
	Label label;
	TextField txtField;
	public static void main(String[] args) {
		Main k = new Main();
	}

	public Main(){
		super("Event Frame");
		Panel panel = new Panel();
		label = new Label();
		txtField = new TextField(20);
		txtField.addKeyListener(new KeyListener());
		panel.add(txtField, BorderLayout.CENTER);
		add(panel, BorderLayout.CENTER);
		add(label, BorderLayout.CENTER);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		setSize(600,600);
		setVisible(true);
	}

	public class KeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent ke){
			char i = ke.getKeyChar();
			String str = Character.toString(i);
			label.setText(str);
			label.setSize(100, 100);
			label.setFont(new Font("Serif", Font.PLAIN, 80));
			label.setLocation(275, 250);
		}
	}	
}
