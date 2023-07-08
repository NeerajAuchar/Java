import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class first extends Applet implements KeyListener
{
	String msg = "";
	int X = 100, Y = 100; // output coordinates
		public void init()
		{
			addKeyListener(this);
		}
		public void keyPressed(KeyEvent ke)
		{
			showStatus("Key is pressed");
		}
		public void keyReleased(KeyEvent ke)
		{
			showStatus("Key is released");
		}
		public void keyTyped(KeyEvent ke)
		{
			msg += ke.getKeyChar();
			repaint();
		} 
		public void paint(Graphics g)    // Display keystrokes.
	{      
		g.drawString(msg, X, Y);
	}
}
