import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author CHRISTIAN
 */
public class Gestionnaire_De_Connection {
       Connection conn=null;
    public static Connection ConnctBD(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/copie_zaza","root","");
            return conn;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        return null;
}
 }
    

 