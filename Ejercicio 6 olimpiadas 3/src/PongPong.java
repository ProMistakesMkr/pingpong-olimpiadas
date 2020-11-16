import processing.core.PApplet;

public class PongPong extends PApplet {

	public static void main(String[] args) {

		PApplet.main("PongPong");

	}

	@Override
	public void settings() {

		size(500, 500);

	}

	rectangulo player;
	rectangulo2 player2;

	rectangulo y1;
	
	@Override
	public void setup() {

		player = new rectangulo(20, 210, 15, 80);
		player2 = new rectangulo2(480, 210, 15, 80);
		y1=new rectangulo();

	}

	@Override
	public void draw() {
		background(255);

		player.pintar(this);
		player2.pintar(this);
		

	}

	public void keyPressed() {
		
		player.keyPressed(this);
		player2.keyPressed(this);
		
	}
	


}
