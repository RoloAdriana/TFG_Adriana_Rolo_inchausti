import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.JOptionPane;

	/**
	 * Se alamcenan los valores adquiridos de la base de datos. 
	 */
public class Platform{

	@SuppressWarnings("deprecation")
	public ArrayList<PlatformType> listadejugadas() {
	  ArrayList< PlatformType> juegoGato = new ArrayList<PlatformType>();
	  ConexionMySQL sqlconect= new ConexionMySQL();

	try {
	   PreparedStatement consulta = sqlconect.getConnection().prepareStatement("SELECT * FROM platform");
	   ResultSet res = consulta.executeQuery();
	   while(res.next()){
	    PlatformType gato= new PlatformType();
	    gato.setID_jugador(res.getString("ID_jugador"));	
	    gato.setPuntos(Integer.parseInt(res.getString("puntos")));
	    gato.setEnemigosAcabados(Integer.parseInt(res.getString("enemigosAcabados")));
	    gato.setNumObjetos(Integer.parseInt(res.getString("objetosCogidos")));
	    Time aux; 
	    aux = res.getTime("tiempoJuego");
	    int min = aux.getMinutes();
	    int seg = aux.getSeconds();
	    gato.setTiempo((min*60)+seg);
	    gato.setNumFlechaDerecha(Integer.parseInt((res.getString("flechaDerecha"))));
	    gato.setNumFlechaIzqda(Integer.parseInt((res.getString("flechaIzqda"))));
	    gato.setNumSaltos(Integer.parseInt(res.getString("saltos")));
	    gato.setVidasPerdidasCaidas(Integer.parseInt(res.getString("vidasPerdidasCaidas")));
	    gato.setVidasPerdidasEnemigos(Integer.parseInt(res.getString("vidasPerdidasCaidas")));
 
	    
	    juegoGato.add(gato);
	          }
	          res.close();
	          consulta.close();
	          sqlconect.desconectar();
	    
	  } catch (Exception e) {
	   JOptionPane.showMessageDialog(null, "no se pudo consultar en la base de datos\n"+e);
	  }
	  return juegoGato;
	 }
	 
}

