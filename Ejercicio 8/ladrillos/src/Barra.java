import processing.core.PApplet;

public class Barra {
	
	private int x,y,color;
	
	public Barra(int x,int y,int c) {
		this.y = y;
		this.x = x;
		this.color = c;
	}
	
	public void pintar(PApplet app) {
		switch (color){
		
			case 0:
			//Barrita jugar
			app.fill(40, 0, 46);
			app.rect(x, y, 100, 20);
			break;
			//Azul1
			case 1:
			app.fill(10, 1, 85 );
			app.rect(x, y, 90, 30);
			break;
			//Violeta1
			case 2:
			app.fill(120, 17, 136);
			app.rect(x, y, 90, 30);
			break;
			//Azul2
			case 3:
			app.fill(20, 0, 182);
			app.rect(x, y, 90, 30);
			break;
			//Violeta2
			case 4:
			app.fill(206, 45, 231);
			app.rect(x, y, 90, 30);
			break;
		}
	}
	
	public int getY() {
		return y;
	}
	
	public int getX() {
		return x;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

}
