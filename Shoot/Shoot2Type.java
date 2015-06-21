import java.util.ArrayList;
import java.util.List;


public class Shoot2Type {
	String idJugador;
	int disparosHechos;
	int disparosRecibidos;
	int torretasDestruidas;
	int arañasMatados;
	int bonoVida;
	int choqueArañas;
	int teclaAbajo;
	int teclaArriba;
	int teclaDerecha;
	int teclaIzqda;
	int tiempoJuego;
	int gema; 
	int puntos; 
	
	public int MAX_DISPAROS_HECHOS=300;
	public int MAX_DISPAROS_RECIBIDOS=60;
	public int MAX_TORRETAS_DESTRUIDAS=30;
	public int MAX_ENEMIGOS_MATADOS=60;
	public int MAX_CHOQUE_ARAÑAS=50;
	public int MAX_TECLA_ARRIBA=60;
	public int MAX_TECLA_ABAJO=60;
	public int MAX_TECLA_IZQDA=50;
	public int MAX_TECLA_DERECHA=60;
	public int MAX_TIEMPO_JUEGO=120;	
	public int MAX_PUNTOS=4000;
	public int MAX_BONO_VIDA=4;
	public int MAX_GEMA=1;
	
	
	public List<String> features;
	public List<String> clusters; 
	
	public Shoot2Type() {
		// TODO Auto-generated constructor stub
		
		
		this.features = new ArrayList<String>();
		this.clusters = new ArrayList<String>();
		
		features.add("Disparos Hechos");
		features.add("Disparos Recibidos");
		features.add("Torretas Destruidas");
		features.add("Enemigos Matados");
		features.add("Choque con enemigos");
		features.add("Flecha Arriba");
		features.add("Flecha Abajo");
		features.add("Flecha izqda");	
		features.add("Flecha Derecha");
		features.add("Gema");

		clusters.add("cobardes");
		clusters.add("torpes");
		clusters.add("agiles");
		clusters.add("afortunados");
		
	}
	

	public Shoot2Type(String idJugador, int disparosHechos,
			int disparosRecibidos, int torretasDestruidas, int arañasMatados,
			int bonoVida, int choqueArañas, int teclaAbajo, int teclaArriba,
			int teclaDerecha, int teclaIzqda, int tiempoJuego, int gema,
			int puntos) {
		super();
		this.idJugador = idJugador;
		this.disparosHechos = disparosHechos;
		this.disparosRecibidos = disparosRecibidos;
		this.torretasDestruidas = torretasDestruidas;
		this.arañasMatados = arañasMatados;
		this.bonoVida = bonoVida;
		this.choqueArañas = choqueArañas;
		this.teclaAbajo = teclaAbajo;
		this.teclaArriba = teclaArriba;
		this.teclaDerecha = teclaDerecha;
		this.teclaIzqda = teclaIzqda;
		this.tiempoJuego = tiempoJuego;
		this.gema = gema;
		this.puntos = puntos;
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


	public int getBonoVida() {
		return bonoVida;
	}


	public void setBonoVida(int bonoVida) {
		this.bonoVida = bonoVida;
	}


	public int getGema() {
		return gema;
	}


	public void setGema(int gema) {
		this.gema = gema;
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
	public int getDisparosHechos() {
		return disparosHechos;
	}
	public void setDisparosHechos(int disparosHechos) {
		this.disparosHechos = disparosHechos;
	}
	public int getDisparosRecibidos() {
		return disparosRecibidos;
	}
	public void setDisparosRecibidos(int disparosRecibidos) {
		this.disparosRecibidos = disparosRecibidos;
	}
	public int getTorretasDestruidas() {
		return torretasDestruidas;
	}
	public void setTorretasDestruidas(int torretasDestruidas) {
		this.torretasDestruidas = torretasDestruidas;
	}
	public int getArañasMatados() {
		return arañasMatados;
	}
	public void setArañasMatados(int arañasMatados) {
		this.arañasMatados = arañasMatados;
	}
	public int getChoqueArañas() {
		return choqueArañas;
	}
	public void setChoqueArañas(int choqueArañas) {
		this.choqueArañas = choqueArañas;
	}
	public int getTeclaAbajo() {
		return teclaAbajo;
	}
	public void setTeclaAbajo(int teclaAbajo) {
		this.teclaAbajo = teclaAbajo;
	}
	public int getTeclaArriba() {
		return teclaArriba;
	}
	public void setTeclaArriba(int teclaArriba) {
		this.teclaArriba = teclaArriba;
	}
	public int getTeclaDerecha() {
		return teclaDerecha;
	}
	public void setTeclaDerecha(int teclaDerecha) {
		this.teclaDerecha = teclaDerecha;
	}
	public int getTeclaIzqda() {
		return teclaIzqda;
	}
	public void setTeclaIzqda(int teclaIzqda) {
		this.teclaIzqda = teclaIzqda;
	}
	
	

}
