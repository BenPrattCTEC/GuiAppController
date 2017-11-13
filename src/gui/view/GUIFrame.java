package gui.view;
import gui.controller.GUIAppController;
import javax.swing.JFrame;


public class GUIFrame extends JFrame{
	private GUIAppController controller;
	
	public GUIFrame(GUIAppController controller){
		super();
		this.controller = controller;
		setupFrame();
		
	}
	
	private void setupFrame(){
		
		
		this.setTitle("GUI Testing");
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	
}
