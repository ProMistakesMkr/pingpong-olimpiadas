import processing.core.PApplet;

public class bolita {

	int posX, posY, diametro;
	private int r, g, b;
	boolean mov;

	boolean movright;
	boolean movdown;

	int speedside = 3;
	int speedvertical = 4;
	int score1 = 0;
	int score2 = 0;

	public bolita(int posX, int posY, int diametro) {
		this.posX = posX;
		this.posY = posY;
		this.diametro = diametro;
		this.r = 255;
		this.g = 0;
		this.b = 0;
	}

	public void pintar(PApplet app) {

		app.fill(r, g, b);
		app.ellipse(posX, posY, diametro, diametro);

	}

	public void mover() {

		if (movright == true) {

			posX = posX + speedside;
		} else {
			posX = posX - speedside;
		}
		if (movdown == true) {
			posY = posY + speedvertical;
		} else {

			posY = posY - speedvertical;
		}

		if (posY <= 10) {
			movdown = true;
		}

		if (posY >= 490) {
			movdown = false;

		}

		if (posX >= 490) {
			// movright = false;
			score1++;
			posX = 500 / 2;
			posY = 500 / 2;
		}

		if (posX <= 10) {
			// movright = true;

			score2++;
			posX = 500 / 2;
			posY = 500 / 2;

		}

		/*
		 * if (mov == true) { posX += 10; posY +=
		 * Math.floor(Math.random()*(10-(-10)+1)+(-10)); } if (posX > 500) { mov =
		 * false; } if (posX < 0) { mov = false; } if (posY > 500) { mov = false; } if
		 * (posY < 0) { mov = false; } if (mov == false) { posX = 250; posY = 250; }
		 */

	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public boolean isMov() {
		return mov;
	}

	public void setMov(boolean mov) {
		this.mov = mov;
	}

	public boolean isMovright() {
		return movright;
	}

	public void setMovright(boolean movright) {
		this.movright = movright;
	}

	public boolean isMovdown() {
		return movdown;
	}

	public void setMovdown(boolean movdown) {
		this.movdown = movdown;
	}

	public int getSpeedside() {
		return speedside;
	}

	public void setSpeedside(int speedside) {
		this.speedside = speedside;
	}

	public int getSpeedvertical() {
		return speedvertical;
	}

	public void setSpeedvertical(int speedvertical) {
		this.speedvertical = speedvertical;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

}
