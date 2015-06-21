import java.util.ArrayList;
import java.util.List;


public class Platform2Type {


	String idJugador; 
	int puntos; 
	int numeroObjetos;
	int choqueVaca;
	int choqueSerpiente;
	int saltos;
	int tiempoJuego; 
	int choquePared;
	
	public int MAX_PUNTOS=3200;
	public int MAX_OBJETOS=35;
	public int MAX_CHOQUE_VACA=7;
	public int MAX_CHOQUE_SERPIENTE=7;
	public int MAX_SALTOS=45;
	public int MAX_TIEMPO_JUEGO=150;
	public int MAX_CHOQUE_PARED=7;
	
	public List<String> features;
	public List<String> clusters; 
	
	public Platform2Type() {
		// TODO Auto-generated constructor stub
		
		this.features = new ArrayList<String>();
		this.clusters = new ArrayList<String>();
		features.add("Puntos");
		features.add("Vacas");
		features.add("Serpientes");
		features.add("Pared");
		
		
		clusters.add("torpes");
		clusters.add("agiles");
		clusters.add("ambiciosos");
		clusters.add("precavidos");
	}

	public Platform2Type(String idJugador, int puntos, int numeroObjetos,int choqueEnemigos, 
						int saltos, int tiempoJuego,int choqueVaca,int choqueSerpiente,int choquePared) {
		super();
		this.idJugador = idJugador;
		this.puntos = puntos;
		this.numeroObjetos = numeroObjetos;
		this.saltos = saltos;
		this.tiempoJuego = tiempoJuego;
		this.choqueVaca = choqueVaca;
		this.choqueSerpiente = choqueSerpiente;
		this.choquePared = choquePared;
		
	}
	
	
	public List<String> getFeatures() {
		return features;
	}

	public List<String> getClusters() {
		return clusters;
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
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getNumeroObjetos() {
		return numeroObjetos;
	}
	public void setNumeroObjetos(int numeroObjetos) {
		this.numeroObjetos = numeroObjetos;
	}

	public int getChoqueVaca() {
		return choqueVaca;
	}

	public void setChoqueVaca(int choqueVaca) {
		this.choqueVaca = choqueVaca;
	}

	public int getChoqueSerpiente() {
		return choqueSerpiente;
	}

	public void setChoqueSerpiente(int choqueSerpiente) {
		this.choqueSerpiente = choqueSerpiente;
	}

	public int getChoquePared() {
		return choquePared;
	}

	public void setChoquePared(int choquePared) {
		this.choquePared = choquePared;
	}

	public int getSaltos() {
		return saltos;
	}
	public void setSaltos(int saltos) {
		this.saltos = saltos;
	}
	

}
