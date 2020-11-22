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
	int mitad = 250;
	int mitad2;

	@Override
	public void setup() {

		// player.setMitad(mitad);
		// int mitad2 = player2.setMitad();

		player = new rectangulo(20, mitad, 15, 90);
		player2 = new rectangulo2(465, 250, 15, 90);
		sel = null;

		bola = new bolita(width / 2, height / 2, 25);
	}

	@Override
	public void draw() {

		int posYrect1 = player.getPosY();
		int posYrect2 = player2.getPosY2();

		int bx = bola.getPosX();
		int by = bola.getPosY();
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

		if (bx >= 465 && by > posYrect2 && by < (posYrect2 + 100)) {

			bola.setMovright(false);

		}

		if (bx <= 19 && by > posYrect1 && by < (posYrect1 + 90)) {

			bola.setMovright(true);

		}
		int pruebay = player.getPosY();

		// System.out.println(pruebay);
		System.out.println(bola.movright);
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
