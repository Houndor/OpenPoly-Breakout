import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		setWidth(Settings.PADDLE_WIDTH);
		setHeight(Settings.PADDLE_HEIGHT);
		resetPosition();
	}
	
	public void resetPosition() {
		x = Settings.INITIAL_BALL_X;
		y = Settings.INITIAL_BALL_Y;
	}
	
	public void update() {
		x += xVelocity;
		
		if(x <= 0) {
			setX(0);
			setXVelocity(1);
		}
		
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			setX(0);
			setXVelocity(-1);
		}


	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		xVelocity = x;
	}
}
