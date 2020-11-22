import processing.core.PApplet;

public class Bola {
	
	private int x, y, diametro;
	private boolean subir,der;
	
	public Bola(int x, int y) {
		this.x = x;
		this.y = y;
		this.diametro = 30;
	
	}
	
	public void pintar(PApplet app) {
		app.fill(255,100,250);
		app.circle(x,y,diametro);
	}
	
	public void mover() {
		
		if (subir==true) {
			y -= 5;
		}
		
		if (subir==false) {
			y += 5;
		}
		
		if (der==true) {
			x += 5;
		}
		
		if (der==false) {
			x -= 5;
		}
		
	}
	
	
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public boolean getSubir(){
		return subir;
	}
	
	public boolean getDer(){
		return der;
	}
	public void setSubir(boolean s) {
		this.subir = s;
	}
	public void setDer(boolean der) {
		this.der = der;
	}
	

}
