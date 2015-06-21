import java.sql.*;

public class ConexionMySQL {
	/**Parametros de conexion*/
    public String db = "juego";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "adriana1";
    public String pass = "";

    Connection connection = null;
    
    /** Constructor de DbConnection */
    public ConexionMySQL() {
       try{
          //obtenemos el driver de para mysql
          Class.forName("com.mysql.jdbc.Driver");
          //obtenemos la conexión
          connection = DriverManager.getConnection(url,user,pass);
  
          if (connection!=null){
             System.out.println("Conexión a base de datos "+db+" OK\n");
          }
       }
       catch(SQLException e){
          System.out.println(e);
       }catch(ClassNotFoundException e){
          System.out.println(e);
       }catch(Exception e){
          System.out.println(e);
       }
    }
    /**Permite retornar la conexión*/
    public Connection getConnection(){
       return connection;
    }
  
    public void desconectar(){
       connection = null;
    }
}
   
