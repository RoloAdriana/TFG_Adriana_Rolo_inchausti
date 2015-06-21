import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.JOptionPane;

	/**
	 * Se alamcenan los valores adquiridos de la base de datos. 
	 */
public class PathFinding2 {

	@SuppressWarnings("deprecation")
	public ArrayList<PathFinding2Type> listadejugadas() {
	  ArrayList< PathFinding2Type> juegoPathFinding2 = new ArrayList<PathFinding2Type>();
	  ConexionMySQL sqlconect= new ConexionMySQL();

	try {
	   PreparedStatement consulta = sqlconect.getConnection().prepareStatement("SELECT * FROM pathFinding2");
	   ResultSet res = consulta.executeQuery();
	   while(res.next()){
	    PathFinding2Type pathFinding2= new PathFinding2Type();
	    pathFinding2.setIdJugador(res.getString("ID_jugador"));
	    pathFinding2.setNumeroClicks(Integer.parseInt(res.getString("NumeroClicks")));
	    pathFinding2.setVidasPerdidas(Integer.parseInt(res.getString("VidasPerdidas")));
	    pathFinding2.setObstaculosChocados(Integer.parseInt(res.getString("ObstaculosChocados")));
	    Time aux; 
	    aux = res.getTime("tiempoJuego");
	    int min = aux.getMinutes();
	    int seg = aux.getSeconds();
	    pathFinding2.setTiempoJuego((min*60)+seg);
	    pathFinding2.setPuntos(Integer.parseInt(res.getString("puntos")));
	    pathFinding2.setMoscasCogidas(Integer.parseInt(res.getString("moscasCogidas")));
	    pathFinding2.setLengua(Integer.parseInt(res.getString("sacarLengua")));
	    pathFinding2.setRanas(Integer.parseInt(res.getString("ranasRescatadas")));

	    
	    juegoPathFinding2.add(pathFinding2);
	          }
	          res.close();
	          consulta.close();
	          sqlconect.desconectar();
	    
	  } catch (Exception e) {
	   JOptionPane.showMessageDialog(null, "no se pudo consultar en la base de datos\n"+e);
	  }
	  return juegoPathFinding2;
	 }
	 
}
