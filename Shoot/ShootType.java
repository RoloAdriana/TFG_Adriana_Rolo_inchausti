import java.util.ArrayList;
import java.util.List;


public class ShootType {
	
	String idJugador;
	int disparosHechos;
	int disparosRecibidos;
	int piedrasDestruidas;
	int enemigosMatados;
	int bonoVida;
	int choqueNave;
	int teclaAbajo;
	int teclaArriba;
	int teclaDerecha;
	int teclaIzqda;
	int tiempoJuego;
	
	public int MAX_DISPAROS_HECHOS=250;
	public int MAX_DISPAROS_RECIBIDOS=90;
	public int MAX_PIEDRAS_DESTRUIDAS=70;
	public int MAX_ENEMIGOS_MATADOS=40;
	public int MAX_BONO_VIDA=2;
	public int MAX_CHOQUE_NAVE=20;
	public int MAX_TECLA_ARRIBA=1200;
	public int MAX_TECLA_ABAJO=1200;
	public int MAX_TECLA_DERECHA=1200;
	public int MAX_TECLA_IZQDA=1200;
	public int MAX_TIEMPO_JUEGO=120;
	
	public List<String> features;
	public List<String> clusters; 
	

	public ShootType() {
		// TODO Auto-generated constructor stub
		
		this.features = new ArrayList<String>();
		this.clusters = new ArrayList<String>();
		features.add("Flecha Derecha");
		features.add("Flecha Arriba");
		features.add("Bonos de Vida");
		features.add("Choque con enemigos");
		features.add("Disparos Hechos");
		features.add("Disparos Recibidos");
		features.add("Enemigos Matados");
		features.add("Piedras destruidas");
		features.add("Tiempo de juego");

		clusters.add("Sin estrategia");
		clusters.add("precavidos");
		clusters.add("atrevidos");
	}

	public ShootType(String idJugador, int disparosHechos,
			int disparosRecibidos, int piedrasDestruidas, int enemigosMatados,
			int bonoVida, int choqueNave, int teclaAbajo, int teclaArriba,
			int teclaDerecha, int teclaIzqda, int tiempoJuego) {
		super();
		this.idJugador = idJugador;
		this.disparosHechos = disparosHechos;
		this.disparosRecibidos = disparosRecibidos;
		this.piedrasDestruidas = piedrasDestruidas;
		this.enemigosMatados = enemigosMatados;
		this.bonoVida = bonoVida;
		this.choqueNave = choqueNave;
		this.teclaAbajo = teclaAbajo;
		this.teclaArriba = teclaArriba;
		this.teclaDerecha = teclaDerecha;
		this.teclaIzqda = teclaIzqda;
		this.tiempoJuego = tiempoJuego;
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
	public int getPiedrasDestruidas() {
		return piedrasDestruidas;
	}
	public void setPiedrasDestruidas(int piedrasDestruidas) {
		this.piedrasDestruidas = piedrasDestruidas;
	}
	public int getEnemigosMatados() {
		return this.enemigosMatados;
	}
	public void setEnemigosMatados(int enemigosMatados) {
		this.enemigosMatados = enemigosMatados;
	}
	public int getBonoVida() {
		return bonoVida;
	}
	public void setBonoVida(int bonoVida) {
		this.bonoVida = bonoVida;
	}
	public int getChoqueNave() {
		return choqueNave;
	}
	public void setChoqueNave(int choqueNave) {
		this.choqueNave = choqueNave;
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
