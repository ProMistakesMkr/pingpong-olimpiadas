import processing.core.PApplet;

public class rectangulo {
	int posX, posY, lado1, lado2;
	private int r, g, b;
	private boolean crash, mov, mov2;
	int mitad = 250;

	public rectangulo() {

		this.posX = 10;
		this.posY = 10;
		this.lado1 = 5;
		this.lado2 = 15;
		this.mov = false;
		this.mov2 = false;
		this.crash = false;
		this.mitad=250;

	}

	public rectangulo(int posX, int posY, int lado1, int lado2) {

		this.posX = posX;
		this.posY = posY;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.r = 0;
		this.g = 255;
		this.b = 0;
		this.mitad=mitad;

	}

	public void pintar(PApplet app) {
		app.fill(r, g, b);
		app.rect(posX, posY, lado1, lado2);

	}

	public void keyPressed(PApplet app) {

		switch (app.key) {
		case 'w':

			posY -= 10;

			break;

		case 's':

			posY += 10;

			break;

		case 'p':

		default:
			break;
		}

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

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
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

	public int getMitad() {
		return mitad;
	}

	public void setMitad(int mitad) {
		this.mitad = mitad;
	}

}
