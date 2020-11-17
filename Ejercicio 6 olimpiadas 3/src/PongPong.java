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

	rectangulo2 sel;

	@Override
	public void setup() {

		player = new rectangulo(20, 210, 15, 80);
		player2 = new rectangulo2(480, 210, 15, 80);
		sel = null;

	}

	@Override
	public void draw() {
		background(255);

		player.pintar(this);
		player2.pintar(this);

	}

	public void keyPressed() {

		player.keyPressed(this);
		// player2.keyPressed(this);

	}

	public void mousePressed() {

		int xC2 = player2.getPosX2();
		int yC2 = player2.getPosY2();
		int lC1 = player2.getLado1();
		int lC2 = player2.getLado2();

		if (dist(mouseX, mouseY, xC2, yC2) < lC2 && dist(mouseX, mouseY, xC2 + 20, yC2 + 80) < lC2) {
			sel = player2;
		}

	}

	public void mouseDragged() {

		if (sel != null) {
			// sel.setPosX2(mouseX);
			sel.setPosY2(mouseY);

		}

	}

}
