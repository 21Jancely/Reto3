
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion{
    
    Connection connection;
    
    //Atributos
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_g55_db";
    String usuario = "root";
    String password = "";
    
    //2. Anadimos constructor
    public Conexion(){
        //3. Intentar conectar con la base de datos
        
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion,usuario,password);
            
            //4. Verificamos si la conexion devuelve algo
            if (connection != null){
                System.out.println(" Conexion exitosa con la Base de datos ");
            }
              
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(" No se puede establecer conexion ");
        }
        
    }
    //5.Creal funcion que retorna la clase Connection


public Connection getConnection(){
    
return connection;
    }

}


