import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MyDrawing extends JPanel {
	private Cat cat;
	private Cat catFriend;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
		// Add a friend for our initial cat
		catFriend = new Cat();
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		// position modified to 55,55
		cat.draw(g, 55, 55,'g');
		// draw a friend for our initial cat
		catFriend.draw(g, 200, 200,'o');
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		
		// size modified from option 1 commit
		frame.setSize(500, 500);
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
