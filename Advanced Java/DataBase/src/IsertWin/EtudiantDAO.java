package IsertWin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EtudiantDAO {
    void insert(Etudiant e) {
        Connection connection = OracleConnection.getConnection();
        try {
            Statement st = connection.createStatement();
            String query = "INSERT INTO Etudiants (prenom, nom, classe, login, password) VALUES ('"+e.getPrenom()+"','"+e.getNom()+"','"+e.getClasse()+"','"+e.getLogin()+"','"+e.getPassword()+"')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Etudiant add with success");
            st.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    public ArrayList <Etudiant> getAllEtudiant(){
    	ArrayList<Etudiant> le =null;
    	Connection connection = OracleConnection.getConnection();
        try {
        	Statement st = connection.createStatement();
        	ResultSet sr = st.executeQuery("select* from etudiants");
        	while (sr.next()) {
        		if(le == null) {
        			le = new ArrayList();
        		}
        		Etudiant e = new Etudiant(sr.getString(1),sr.getString(2),sr.getString(3),sr.getString(4),sr.getString(5));
        		le.add(e);
        	}
        } catch (SQLException ex) {
            System.out.println("erreur de statement"+ex.getMessage());
            return le;
            }
        return le;
    }
    
}
