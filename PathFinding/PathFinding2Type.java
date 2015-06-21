import java.util.ArrayList;
import java.util.List;


public class PathFinding2Type {
String idJugador;
int numeroClicks;
int obstaculosChocados;
int vidasPerdidas;
int tiempoJuego;
int puntos; 
int moscasCogidas;
int lengua; 
int ranas; 


public int MAX_CLICKS=850;
public int MAX_OBSTACULOS=150;
public int MAX_VIDAS_PERDIDAS=3;
public int MAX_TIEMPO_JUEGO=240;
public int MAX_PUNTOS=200;
public int MAX_MOSCAS=20;
public int MAX_LENGUA=150;
public int MAX_RANAS=5;

public List<String> features;
public List<String> clusters; 

	public PathFinding2Type() {
		// TODO Auto-generated constructor stub
		this.features = new ArrayList<String>();
		this.clusters = new ArrayList<String>();
		
		features.add("Numero de clicks");		
		features.add("Obstaculos");
		features.add("Vidas perdidas");
		features.add("Tiempo");
		features.add("puntos");
		features.add("lengua");
		features.add("Ranas");

		clusters.add("suicida");
		clusters.add("ambicioso");
		clusters.add("Optimos");


	}
	

	
	public PathFinding2Type(String idJugador, int numeroClicks,
			int obstaculosChocados, int vidasPerdidas, int tiempoJuego,
			int puntos, int moscasCogidas, int lengua, int ranas) {
		super();
		this.idJugador = idJugador;
		this.numeroClicks = numeroClicks;
		this.obstaculosChocados = obstaculosChocados;
		this.vidasPerdidas = vidasPerdidas;
		this.tiempoJuego = tiempoJuego;
		this.puntos = puntos;
		this.moscasCogidas = moscasCogidas;
		this.lengua = lengua;
		this.ranas = ranas;
	}
	
	public List<String> getFeatures() {
		return features;
	}


	public void setFeatures(List<String> features) {
		this.features = features;
	}


	public List<String> getClusters() {
		return clusters;
	}


	public void setClusters(List<String> clusters) {
		this.clusters = clusters;
	}



	public int getMoscasCogidas() {
		return moscasCogidas;
	}



	public void setMoscasCogidas(int moscasCogidas) {
		this.moscasCogidas = moscasCogidas;
	}



	public int getLengua() {
		return lengua;
	}



	public void setLengua(int lengua) {
		this.lengua = lengua;
	}



	public int getRanas() {
		return ranas;
	}



	public void setRanas(int ranas) {
		this.ranas = ranas;
	}



	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getTiempoJuego() {
		return tiempoJuego;
	}
	public void setTiempoJuego(int tiempoJuego) {
		this.tiempoJuego = tiempoJuego;
	}
	public String getIdJugador() {
		return idJugador;
	}
	public void setIdJugador(String idJugador) {
		this.idJugador = idJugador;
	}
	public int getNumeroClicks() {
		return numeroClicks;
	}
	public void setNumeroClicks(int numeroClicks) {
		this.numeroClicks = numeroClicks;
	}
	public int getObstaculosChocados() {
		return obstaculosChocados;
	}
	public void setObstaculosChocados(int obstaculosChocados) {
		this.obstaculosChocados = obstaculosChocados;
	}
	public int getVidasPerdidas() {
		return vidasPerdidas;
	}
	public void setVidasPerdidas(int vidasPerdidas) {
		this.vidasPerdidas = vidasPerdidas;
	}

}
