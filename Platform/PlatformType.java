import java.util.ArrayList;
import java.util.List;


public class PlatformType {
String ID_jugador; 
int puntos;
int numObjetos;
int tiempo;
int enemigosAcabados;
int numFlechaArriba;
int numFlechaDerecha;
int numFlechaIzqda;
int numSaltos;
int vidasPerdidasCaidas;
int vidasPerdidasEnemigos;
// maximos para normalizar 
public int MAX_PUNTOS=25000;
public int MAX_NUM_OBJETOS=70;
public int MAX_TIEMPO=270;
public int MAX_ENEMIGOSACABADOS=40;
public int MAX_NUM_FLECHA_DERECHA=200;
public int MAX_NUM_FLECHA_IZQDA=60;
public int MAX_NUM_SALTOS=150;
public int MAX_VIDAS_PERDIDAS_CAIDAS=7;
public int MAX_VIDAS_PERDIDAS_ENEMIGOS=7;
public List<String> features;
public List<String> clusters; 

public PlatformType(String iD_jugador, int puntos, int numObjetos,
		int enemigosAcabados, int numFlechaArriba, int numFlechaDerecha,
		int numFlechaIzqda, int numSaltos, int vidasPerdidasCaidas,int vidasPerdidasEnemigos, int tiempo) {
	super();
	ID_jugador = iD_jugador;
	this.puntos = puntos;
	this.numObjetos = numObjetos;
	this.enemigosAcabados = enemigosAcabados;
	this.numFlechaArriba = numFlechaArriba;
	this.numFlechaDerecha = numFlechaDerecha;
	this.numFlechaIzqda = numFlechaIzqda;
	this.numSaltos = numSaltos;
	this.vidasPerdidasCaidas=vidasPerdidasCaidas;
	this.vidasPerdidasEnemigos=vidasPerdidasEnemigos;
	this.tiempo=tiempo;
	this.features = new ArrayList<String>();
	this.clusters = new ArrayList<String>();
	features.add("Puntos");
	features.add("Saltos");
	features.add("Flecha Derecha");
	features.add("Flecha izquierda");
	features.add("Vidas Caidas");
	features.add("Tiempo");
	
	
	clusters.add("Impacientes");
	clusters.add("torpes");
	clusters.add("agiles");
	clusters.add("pacificos");
}


public List<String> getFeatures() {

	return features;
}

public List<String> getClusters() {
	return clusters;
}


public PlatformType() {
	super();
	// TODO Auto-generated constructor stub
	this.features = new ArrayList<String>();
	this.clusters = new ArrayList<String>();
	features.add("Puntos");
	features.add("Saltos");
	features.add("Flecha Derecha");
	features.add("Flecha izquierda");
	features.add("Vidas Caidas");
	features.add("Tiempo");
	
	
	clusters.add("Impacientes");
	clusters.add("torpes");
	clusters.add("agiles");
	clusters.add("pacificos");

}


public String getID_jugador() {
	return ID_jugador;
}
public void setID_jugador(String iD_jugador) {
	ID_jugador = iD_jugador;
}
public int getPuntos() {
	return puntos;
}
public void setPuntos(int puntos) {
	this.puntos = puntos;
}
public int getNumObjetos() {
	return numObjetos;
}
public void setNumObjetos(int numObjetos) {
	this.numObjetos = numObjetos;
}
public int getEnemigosAcabados() {
	return enemigosAcabados;
}
public void setEnemigosAcabados(int enemigosAcabados) {
	this.enemigosAcabados = enemigosAcabados;
}
public int getNumFlechaArriba() {
	return numFlechaArriba;
}
public void setNumFlechaArriba(int numFlechaArriba) {
	this.numFlechaArriba = numFlechaArriba;
}
public int getNumFlechaDerecha() {
	return numFlechaDerecha;
}
public void setNumFlechaDerecha(int numFlechaDerecha) {
	this.numFlechaDerecha = numFlechaDerecha;
}
public int getNumFlechaIzqda() {
	return numFlechaIzqda;
}
public void setNumFlechaIzqda(int numFlechaIzqda) {
	this.numFlechaIzqda = numFlechaIzqda;
}
public int getNumSaltos() {
	return numSaltos;
}
public void setNumSaltos(int numSaltos) {
	this.numSaltos = numSaltos;
}


public int getVidasPerdidasCaidas() {
	return vidasPerdidasCaidas;
}


public void setVidasPerdidasCaidas(int vidasPerdidasCaidas) {
	this.vidasPerdidasCaidas = vidasPerdidasCaidas;
}


public int getVidasPerdidasEnemigos() {
	return vidasPerdidasEnemigos;
}


public void setVidasPerdidasEnemigos(int vidasPerdidasEnemigos) {
	this.vidasPerdidasEnemigos = vidasPerdidasEnemigos;
}


public int getTiempo() {
	return tiempo;
}

public void setTiempo(int tiempo) {
	this.tiempo = tiempo;
}


}
