import processing.core.PApplet;

public class rectangulo2 {
	int posX2, posY2, lado1, lado2;
	private int r, g, b;
	private boolean crash, mov, mov2;

	public rectangulo2() {

		this.posX2 = 10;
		this.posY2 = 10;
		this.lado1 = 5;
		this.lado2 = 15;
		this.mov = false;
		this.mov2 = false;
		this.crash = false;

	}

	public rectangulo2(int posX, int posY, int lado1, int lado2) {

		this.posX2 = posX;
		this.posY2 = posY;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.r = 0;
		this.g = 255;
		this.b = 0;

	}

	public void pintar(PApplet app) {
		app.fill(r, g, b);
		app.rect(posX2, posY2, lado1, lado2);

	}

	public void keyPressed(PApplet app) {

		switch (app.key) {
		case 'p':

			posY2 -= 5;

			break;

		case 'l':

			posY2 += 5;

			break;

		default:
			break;
		}

	}

	public int getPosX2() {
		return posX2;
	}

	public void setPosX2(int posX2) {
		this.posX2 = posX2;
	}

	public int getPosY2() {
		return posY2;
	}

	public void setPosY2(int posY2) {
		this.posY2 = posY2;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
