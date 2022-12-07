package empleadosCRUD;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author donyc
 */
public class ConexionMYSQL {
    Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/empleadoss_departamentoss", "root", "");
            System.out.println("Estamos conectados con exito.");
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error en la conexion :" + ex);
        }
        return cn;
    }
    
}