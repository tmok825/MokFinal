import processing.core.PApplet;

public class Player {
	PApplet w;
	private int lives;
	private int totalPoints;
	private int x;
	private int y;
	private int width;
	
	public Player(PApplet p, int x, int y) {
		w = p;
		this.x = x;
		this.y = y;
		lives = 3; // default number of lives
		totalPoints = 0;
		width = 40;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth(){
		return width;
	}
	public int getTotalPoints() {
		return totalPoints;
	}

	public void addToTotalPoints(int num) {
		totalPoints += num;
	}

	public int getLives() {
		return lives;
	}

	public void decreaseLives() {
		lives--;
	}

	public boolean isHit() {
		return false;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void draw(int x, int y){
		w.fill(255);
		w.rect(x, y, width, 40);
		this.x = x;
		this.y = y;
	}
}
