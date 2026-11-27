package lab3a;

public class Ball {
	public int x, y, w, h;
	private int dirX, dirY;
	public Ball (int x, int y, int width, int height, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.w = width;
		this.h = height;
		this.dirX = dirX;
		this.dirY = dirY;
	}
	
	public Ball(int x, int y, int width, int height) {
		this(x, y, width, height, 0,0);
	} 
	public void Move() {
	    x += dirX;
	    y += dirY;

	    // Left wall
	    if (x < 0) {
	        x = 0;
	        dirX = -dirX;
	    }

	    // Top wall
	    if (y < 0) {
	        y = 0;
	        dirY = -dirY;
	    }											// keep the balls within the red tile

	    // Right wall
	    if (x > 300 - w) {
	        x = 300 - w;
	        dirX = -dirX;
	    }

	    // Bottom wall
	    if (y > 300 - h) {
	        y = 300 - h;
	        dirY = -dirY;
	    }
	}

}

// When Java sees this(...) as the first line inside a constructor, it means:
//"Call another constructor in this same class whose parameters match these values."

//the second constructor is setting default values for dirX and dirY, so if I don't want
// to set any values for those myself, I don't need to.