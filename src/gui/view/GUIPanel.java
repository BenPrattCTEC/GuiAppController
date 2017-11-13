package gui.view;

import gui.controller.GUIAppController;
import java.awt.Color;
import javax.swing.*;

public class GUIPanel extends JPanel{

	private GUIAppController controller;
	
	public GUIPanel(GUIAppController controller){
		super();
		this.controller = controller;
	}
	
}
