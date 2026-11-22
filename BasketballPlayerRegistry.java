import javax.swing.*;

public class BasketballPlayerRegistry {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		PlayerRegistryForm myFrame = new PlayerRegistryForm();
		
		myFrame.setSize(600,800);
		myFrame.setTitle("Basketball Database Input Form");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setVisible(true);
	}
}
