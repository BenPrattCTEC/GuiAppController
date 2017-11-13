package gui.view;

import gui.controller.GUIAppController;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIPanel extends JPanel {
	
	private GUIAppController controller;
	
	private JButton quitButton;
	private JButton colorChangeButton;
	private SpringLayout layout;
	
	public GUIPanel(GUIAppController controller) {
		super();
		this.controller = controller;
		
		layout = new SpringLayout();
		
		quitButton = new JButton("Quit");
		layout.putConstraint(SpringLayout.WEST, quitButton, 193, SpringLayout.WEST, this);
		colorChangeButton = new JButton("Change Color");
		layout.putConstraint(SpringLayout.WEST, colorChangeButton, 160, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, colorChangeButton, -105, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.NORTH, quitButton, 33, SpringLayout.SOUTH, colorChangeButton);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel() {
		this.setBackground(Color.darkGray);
		this.setLayout(layout);
		this.add(quitButton);
		this.add(colorChangeButton);
	}
	
	private void setupLayout() {
		System.out.println(super.getWidth());
	}
	
	private void setupListeners() {
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				System.exit(0);
			}
		});
		colorChangeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				randomBackgroundColor();
			}
		});
	}
	
	private void randomBackgroundColor(){
		this.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
	}
	
}
