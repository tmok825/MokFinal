import processing.core.PApplet;

public class Bullet {
	private PApplet w;
	private int x;
	private int y;

	public Bullet(int x, int y, PApplet p) {
		this.x = x;
		this.y = y;
		w = p;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isInContact() {
		return false;
	}

	public void draw() {
		w.fill(255, 255, 255);
		w.rect(x, y, 7, 25);
	}
}
