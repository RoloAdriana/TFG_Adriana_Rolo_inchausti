import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.JOptionPane;

	/**
	 * Se alamcenan los valores adquiridos de la base de datos. 
	 */
public class Shoot2 {

	@SuppressWarnings("deprecation")
	public ArrayList<Shoot2Type> listadejugadas() {
	  ArrayList< Shoot2Type> juegoShoot2 = new ArrayList<Shoot2Type>();
	  ConexionMySQL sqlconect= new ConexionMySQL();

	try {
	   PreparedStatement consulta = sqlconect.getConnection().prepareStatement("SELECT * FROM shoot2");
	   ResultSet res = consulta.executeQuery();
	   while(res.next()){
	    Shoot2Type shoot2= new Shoot2Type();
	    shoot2.setIdJugador(res.getString("ID_jugador"));
	    shoot2.setDisparosHechos(Integer.parseInt(res.getString("disparosHechos")));
	    shoot2.setDisparosRecibidos(Integer.parseInt(res.getString("disparosRecibidos")));
	    shoot2.setTorretasDestruidas(Integer.parseInt(res.getString("torretasDestruidas")));
	    shoot2.setArañasMatados(Integer.parseInt(res.getString("enemigosMatados")));
	    shoot2.setBonoVida(Integer.parseInt(res.getString("bonoVida")));
	    shoot2.setChoqueArañas(Integer.parseInt(res.getString("choqueEnemigos")));
	    shoot2.setTeclaArriba(Integer.parseInt(res.getString("teclaArriba")));
	    shoot2.setTeclaDerecha(Integer.parseInt(res.getString("teclaDerecha")));
	    shoot2.setTeclaAbajo(Integer.parseInt(res.getString("teclaAbajo")));
	    shoot2.setTeclaIzqda(Integer.parseInt(res.getString("teclaIzqda")));
	    Time aux; 
	    aux = res.getTime("tiempoJuego");
	    int min = aux.getMinutes();
	    int seg = aux.getSeconds();
	    shoot2.setTiempoJuego((min*60)+seg);
	    shoot2.setPuntos(Integer.parseInt(res.getString("puntos")));
	    shoot2.setGema(Integer.parseInt(res.getString("gema")));
	    juegoShoot2.add(shoot2);
	          }
	          res.close();
	          consulta.close();
	          sqlconect.desconectar();
	    
	  } catch (Exception e) {
	   JOptionPane.showMessageDialog(null, "no se pudo consultar en la base de datos\n"+e);
	  }
	  return juegoShoot2;
	 }
	 
}
