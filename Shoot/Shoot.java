import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.JOptionPane;

	/**
	 * Se alamcenan los valores adquiridos de la base de datos. 
	 */
public class Shoot {

	@SuppressWarnings("deprecation")
	public ArrayList<ShootType> listadejugadas() {
	  ArrayList< ShootType> juegoShoot = new ArrayList<ShootType>();
	  ConexionMySQL sqlconect= new ConexionMySQL();

	try {
	   PreparedStatement consulta = sqlconect.getConnection().prepareStatement("SELECT * FROM shoot");
	   ResultSet res = consulta.executeQuery();
	   while(res.next()){
	    ShootType shoot= new ShootType();
	    shoot.setIdJugador(res.getString("ID_jugador"));
	    shoot.setDisparosHechos(Integer.parseInt(res.getString("disparosHechos")));
	    shoot.setDisparosRecibidos(Integer.parseInt(res.getString("disparosRecibidos")));
	    shoot.setPiedrasDestruidas(Integer.parseInt(res.getString("piedrasDestruidas")));
	    shoot.setEnemigosMatados(Integer.parseInt(res.getString("enemigosMatados")));
	    shoot.setBonoVida(Integer.parseInt(res.getString("bonoVida")));
	    shoot.setChoqueNave(Integer.parseInt(res.getString("choqueNave")));
	    shoot.setTeclaArriba(Integer.parseInt(res.getString("teclaArriba")));
	    shoot.setTeclaDerecha(Integer.parseInt(res.getString("teclaDerecha")));
	    shoot.setTeclaAbajo(Integer.parseInt(res.getString("teclaAbajo")));
	    shoot.setTeclaIzqda(Integer.parseInt(res.getString("teclaIzqda")));
	    Time aux; 
	    aux = res.getTime("tiempoJuego");
	    int min = aux.getMinutes();
	    int seg = aux.getSeconds();
	    shoot.setTiempoJuego((min*60)+seg);
	    
	    juegoShoot.add(shoot);
	          }
	          res.close();
	          consulta.close();
	          sqlconect.desconectar();
	    
	  } catch (Exception e) {
	   JOptionPane.showMessageDialog(null, "no se pudo consultar en la base de datos\n"+e);
	  }
	  return juegoShoot;
	 }
	 
}
