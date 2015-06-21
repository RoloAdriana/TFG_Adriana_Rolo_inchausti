import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestDataBaseConection {

	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
//		ConexionMySQL mysql = new ConexionMySQL();
//		Connection con = mysql.getConnection();
//	    if(con!=null){
//	        JOptionPane.showMessageDialog(null, "Conectado");
//	        try{
//	            con.close();
//	        }catch(SQLException ex){
//	            System.out.println("Error al desconectar "+ex);
//	        }
//	    }
		
		ArrayList< ShootType> juegoShoot = new ArrayList<ShootType>();
		Shoot shoot = new Shoot(); 
		juegoShoot = shoot.listadejugadas();

		
	}
}
