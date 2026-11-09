package pkg23630177_10;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBD {
    
    private Connection conectar = null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3308/alumnos4a", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
