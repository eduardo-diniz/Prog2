public class Porta {

private boolean aberta;

private String cor;

private float dimensaoX;
private float dimensaoY;
private float dimensaoZ;

public float getDimensaoX() {
 return dimensaoX;
}

public void setDimensaoX(float dimensaoX) {
 this.dimensaoX = dimensaoX;
}


public void setDimensaoY(float dimensaoY) {
 this.dimensaoY = dimensaoY;
}

public float getDimensaoY() {
 return dimensaoY;
}
public float getDimensaoZ() {
 return dimensaoZ;
}

public void setDimensaoZ(float dimensaoZ) {
 this.dimensaoZ = dimensaoZ;
}

private String getCor() {
 
 return cor;
}


public void abre() {

aberta = true;
}

public void fecha() {

aberta = false;
}

public void pinta (String novaCor) {

cor = novaCor;

}


public boolean estaAberta() {

return aberta;


}

public static void main (String [] args) {

Porta p1 = new Porta();

p1.pinta("Preto");
p1.setDimensaoX(5);
p1.setDimensaoY(5);
p1.setDimensaoZ(5);
p1.abre();

System.out.println(p1.estaAberta()+ " " +  p1.getCor() + " "  + p1.getDimensaoX()+ " " + p1.getDimensaoZ()+ " " + p1.getDimensaoY());

}






 
}