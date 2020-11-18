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

	bolita bola;
	boolean movright;
	boolean movdown;

	int speedside = 3;
	int speedvertical = 4;

	@Override
	public void setup() {

		//int mitad = player.getMitad();
		//int mitad2 = player2.getMitad();

		player = new rectangulo(20, 250, 15, 90);
		player2 = new rectangulo2(465, 250, 15, 90);
		sel = null;

		bola = new bolita(width / 2, height / 2, 25);
	}

	@Override
	public void draw() {
	/*	int mitad1 = player.getMitad();
		int mitad22 = player2.getMitad();*/

		/*int b1 = bola.getPosX();
		int b2 = bola.getPosY();*/
		background(255);
		int score = bola.getScore1();
		int score2 = bola.getScore2();

		player.pintar(this);
		player2.pintar(this);
		bola.pintar(this);

		bola.mover();

		rectMode(CENTER);

		text("PONGPONG", 220, 20);
		rectMode(CORNER);

		text(score, 150, 20);
		text(score2, 300, 20);

		/*if (b1 >= 465 && b2 > mitad22 && b2 < (mitad22 + 100)) {

			movright = false;

		}

		if (b1 <= 15 && b2 > mitad1 && b2 < (mitad1 + 100)) {

			movright = true;

		}*/
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
		int b1 = bola.getPosX();
		int b2 = bola.getPosY();
		int diam = bola.getDiametro();
		boolean mov = bola.isMov();

		if (dist(mouseX, mouseY, xC2, yC2) < lC2 && dist(mouseX, mouseY, xC2 + 20, yC2 + 80) < lC2) {
			sel = player2;
		}

		if (dist(mouseX, mouseY, b1, b2) < diam) {

			bola.setMov(!mov);
		}

	}

	public void mouseDragged() {

		if (sel != null) {
			// sel.setPosX2(mouseX);
			sel.setPosY2(mouseY);

		}

	}

}
