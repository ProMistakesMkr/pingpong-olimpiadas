import java.util.ArrayList;
import processing.core.PApplet;

public class Principal extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Principal");
	}

	@Override
	public void settings() {
		size(500, 500);
	}

	ArrayList<Barra> barritas;
	Barra barrita;
	Barra selector;
	Barra barra;
	Bola bolita;
	
	int pantalla = 0;
	
	int xBolita = 50;
	int yBolita = 10;
	int c = 1;
	
	int xP=250;
	int yP =470; 
	
	int xJ=250;
	int yJ=400;
	boolean subir=true;
	boolean derecha=true;

	@Override
	public void setup() {
		rectMode(CENTER);
		textAlign(CENTER,CENTER);
		barritas = new ArrayList<Barra>();
		selector = null;
		barra = new Barra(xP,yP,0);
		bolita = new Bola(xJ, yJ);

		for (int i=1;i < 31;i++) {
			Barra actual = new Barra(xBolita,yBolita,c);
			barritas.add(actual);
			xBolita += 100;
			c++;
			if(xBolita > 450) {
				yBolita += 35;
				xBolita = 50;
			}
			if (c>4) {
				c = 1;
			}
		}

	}

	@Override
	public void draw() {
		background(255);
		
		switch (pantalla) {
		case 0:
			noFill();
			strokeWeight(5);
			rect(250,250,200,100);
			fill(72, 0, 115);
			textSize(50);
			text("start",250,240);
			break;
		case 1:
		noStroke();
		bolita.setDer(derecha);
		bolita.setSubir(subir);
		
		//hacer que se no se salga del lienzo
		if (bolita.getX()<0) {
			derecha = true;}		
		if (bolita.getX()>500) {
			derecha=false;}
		if (bolita.getY()>500) {
			pantalla = 2;} 
		if (bolita.getY()<0) {
			subir = false;}
		
		
		barra.pintar(this);
		
		for (int i = 0; i < barritas.size(); i++) {
			Barra actual = barritas.get(i);
			actual.pintar(this);}
		
		bolita.pintar(this);
		bolita.mover();
		
		if (bolita.getX()>barra.getX()-45 && bolita.getX()<barra.getX()+45 && bolita.getY()> barra.getY()-30) {
			subir = !subir;
			
		}
		
		for (int i = 0; i < barritas.size(); i++) {
			Barra actual = barritas.get(i);
			if (dist(bolita.getX(),bolita.getY(), actual.getX(), actual.getY()) < 50) {				
				selector = actual;				
					barritas.remove(i);
					derecha = !derecha;
					subir = !subir;		
			}
		}
		
		if (barritas.size()<1) {pantalla = 3;}
		
		break;
		
		case 2:
			background(255);
			fill(180,0,0);
			textSize(100);
			text("You lost",250,250);
		break;
		
		case 3:
			background(255);
			fill(0,250,100);
			textSize(100);
			text("You won",250,250);
			break;
		}
		
	}

	
		@Override
		public void keyPressed() {
		//Mover con las teclas
			if (key == 'a') {
			xP -= 25;
			barra.setX(xP);
		}
		if (key == 'd') {
			xP += 25;
			barra.setX(xP);
		}
		
		}
		@Override
		public void mousePressed() {
			//Cambio de pantalla
			if (pantalla == 0 && mouseX > 150 && mouseX < 350 && mouseY > 200 && mouseY < 300) {
				pantalla = 1;
			}
		}
	

	
}
