import java.util.ArrayList;
import java.util.List;


public class PathFindingType {

	String idJugador;
	int numeroClicks;
	int enemigosMatados;
	int vidasPerdidas;
	int disparosHechos; 
	int tiempoJuego;
	int princesa;
	
	public int MAX_CLICKS=500;
	public int MAX_DISPAROS_HECHOS=50;
	public int MAX_VIDAS_PERDIDAS=3;
	public int MAX_TIEMPO_JUEGO=240;
	public int MAX_PRINCESA=1;
	public int MAX_ENEMIGOS_MATADOS=4;
	
	public List<String> features;
	public List<String> clusters; 
	
	public PathFindingType(String idJugador, int numeroClicks,
			int obstaculosChocados, int vidasPerdidas, int disparosHechos,
			int tiempoJuego, int princesa) {
		super();
		this.idJugador = idJugador;
		this.numeroClicks = numeroClicks;
		enemigosMatados = obstaculosChocados;
		this.vidasPerdidas = vidasPerdidas;
		this.disparosHechos = disparosHechos;
		this.tiempoJuego = tiempoJuego;
		this.princesa= princesa;
	}

	public PathFindingType() {
		// TODO Auto-generated constructor stub

		this.features = new ArrayList<String>();
		this.clusters = new ArrayList<String>();
		
		features.add("Numero de clicks");		
		features.add("Disparos Hechos");
		features.add("Vidas perdidas");
		features.add("Enemigos Matados");
		features.add("Tiempo");
		features.add("Princesa");

		clusters.add("pacificos");
		clusters.add("lentos");
		clusters.add("optimos");
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


		public int getTiempoJuego() {
		return tiempoJuego;
	}


	public void setTiempoJuego(int tiempoJuego) {
		this.tiempoJuego = tiempoJuego;
	}


		public int getDisparosHechos() {
			return disparosHechos;
		}
	
		public void setDisparosHechos(int disparosHechos) {
			this.disparosHechos = disparosHechos;
		}
		
		public int getPrincesa() {
			return princesa;
		}

		public void setPrincesa(int princesa) {
			this.princesa = princesa;
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
		public int getEnemigosMatados() {
			return enemigosMatados;
		}
		public void setEnemigosMatados(int enemigosMatados) {
			this.enemigosMatados = enemigosMatados;
		}
		public int getVidasPerdidas() {
			return vidasPerdidas;
		}
		public void setVidasPerdidas(int vidasPerdidas) {
			this.vidasPerdidas = vidasPerdidas;
		}


}
