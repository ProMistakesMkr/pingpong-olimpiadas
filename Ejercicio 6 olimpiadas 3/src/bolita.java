import processing.core.PApplet;

public class bolita {

	int posX, posY, diametro;
	private int r, g, b;
	boolean mov;

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

		if (mov == true) {
			posX += 10;
			posY += Math.random() * 10;
		}
		if (posX > 500) {
			mov = false;
		}
		if (posX < 0) {
			mov = false;
		}
		if (posY > 500) {
			mov = false;
		}
		if (posY < 0) {
			mov = false;
		}
		if (mov == false) {
			posX = 250;
			posY = 250;
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
	
	

}
