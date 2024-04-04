import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		setSize(Settings.WINDOW_WIDTH + 15, Settings.WINDOW_HEIGHT);
		setTitle(Settings.WINDOW_NAME);
		setBackground(Color.WHITE);
		setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
        
        setVisible(true);
	}

	public static void main(String[] args) {
		new Breakout();	
	}

}
