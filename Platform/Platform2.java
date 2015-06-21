import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.JOptionPane;


/**
	 * Se alamcenan los valores adquiridos de la base de datos. 
	 */
public class Platform2 {

	@SuppressWarnings("deprecation")
	public ArrayList<Platform2Type> listadejugadas() {
	  ArrayList< Platform2Type> juegocaballo = new ArrayList<Platform2Type>();
	  ConexionMySQL sqlconect= new ConexionMySQL();
	try {
	   PreparedStatement consulta = sqlconect.getConnection().prepareStatement("SELECT * FROM platform2");
	   ResultSet res = consulta.executeQuery();

	   while(res.next()){
	    Platform2Type caballo= new Platform2Type();
	    caballo.setIdJugador(res.getString("ID_jugador"));
	    caballo.setPuntos(Integer.parseInt(res.getString("puntos")));
	    
	    caballo.setChoqueVaca(Integer.parseInt(res.getString("choqueVaca")));
	    caballo.setChoqueSerpiente(Integer.parseInt(res.getString("choqueSerpiente")));
	    caballo.setNumeroObjetos(Integer.parseInt(res.getString("objetosCogidos")));
	    caballo.setSaltos(Integer.parseInt(res.getString("saltos")));
	    Time aux; 
	    aux = res.getTime("tiempoJuego");
	    int min = aux.getMinutes();
	    int seg = aux.getSeconds();
	    caballo.setTiempoJuego((min*60)+seg);
	    caballo.setChoquePared(Integer.parseInt(res.getString("choquePared")));
	    juegocaballo.add(caballo);
	    }
	          res.close();
	          consulta.close();
	          sqlconect.desconectar();
	    
	  } catch (Exception e) {
	   JOptionPane.showMessageDialog(null, "no se pudo consultar en la base de datos\n"+e);
	  }
	  return juegocaballo;
	 }
	 
}

