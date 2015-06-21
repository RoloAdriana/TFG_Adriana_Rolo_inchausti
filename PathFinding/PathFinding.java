import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.JOptionPane;

	/**
	 * Se alamcenan los valores adquiridos de la base de datos. 
	 */
public class PathFinding {

	@SuppressWarnings("deprecation")
	public ArrayList<PathFindingType> listadejugadas() {
	  ArrayList< PathFindingType> juegoPathFinding = new ArrayList<PathFindingType>();
	  ConexionMySQL sqlconect= new ConexionMySQL();

	try {
	   PreparedStatement consulta = sqlconect.getConnection().prepareStatement("SELECT * FROM pathFinding");
	   ResultSet res = consulta.executeQuery();
	   while(res.next()){
	    PathFindingType pathFinding= new PathFindingType();
	    pathFinding.setIdJugador(res.getString("ID_jugador"));
	    pathFinding.setNumeroClicks(Integer.parseInt(res.getString("numeroClicks")));
	    pathFinding.setDisparosHechos(Integer.parseInt(res.getString("disparosHechos")));
	    pathFinding.setVidasPerdidas(Integer.parseInt(res.getString("VidasPerdidas")));
	    Time aux; 
	    aux = res.getTime("tiempoJuego");
	    int min = aux.getMinutes();
	    int seg = aux.getSeconds();
	    pathFinding.setTiempoJuego((min*60)+seg);

	    pathFinding.setEnemigosMatados(Integer.parseInt(res.getString("enemigosMatados")));
	    pathFinding.setPrincesa(Integer.parseInt(res.getString("rescatePrincesa")));
	    juegoPathFinding.add(pathFinding);
	          }
	          res.close();
	          consulta.close();
	          sqlconect.desconectar();
	    
	  } catch (Exception e) {
	   JOptionPane.showMessageDialog(null, "no se pudo consultar en la base de datos\n"+e);
	  }
	  return juegoPathFinding;
	 }
	 
}

