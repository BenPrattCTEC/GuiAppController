package gui.view;
import gui.controller.GUIAppController;
import javax.swing.JFrame;


public class GUIFrame extends JFrame{
	private GUIAppController controller;
	private GUIPanel panel;
	
	public GUIFrame(GUIAppController controller){
		super();
		
		this.controller = controller;
		this.panel = new GUIPanel(controller);
		
		setupFrame();
		
	}
	
	private void setupFrame(){
		
		this.setContentPane(panel);
		this.setTitle("GUI Testing");
		this.setSize(500, 500);
		
		this.setVisible(true);
	}
	
	
}
