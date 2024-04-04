import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	
	public Ball() {
		setWidth(Settings.BALL_WIDTH);
		setHeight(Settings.BALL_HEIGHT);
		resetPosition();
	}
	

	public void resetPosition() {
		x = Settings.INITIAL_BALL_X;
		y = Settings.INITIAL_BALL_Y;
	}
	
	public void update() {
		x += xVelocity;
		y += yVelocity;
		
// Ball bounces on the left side of the window
		if(x <= 0) {
//			setX(0);
			setXVelocity(1);
		}
		
// Ball bounces on the right side of the window
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
//			setX(Settings.WINDOW_WIDTH - Settings.BALL_WIDTH);
			setXVelocity(-1);
		}
		
// Ball bounces off the top of the window
		if(y <= 0) {
			setY(0);
			setYVelocity(1);
		}
		
	}
	
	public void setXVelocity(int x) {
		xVelocity = x;
	}
	public void setYVelocity(int y) {
		yVelocity = y;
	}
	
	public int getXVelocity() {
		return xVelocity;
	}
	public int getYVelocity() {
		return yVelocity;
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
