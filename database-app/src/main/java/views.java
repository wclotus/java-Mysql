import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*public class views {
    static final String DB_URL ="jdviewbc:mysql://localhost:3306";
    static final String USER = "root";
    static final String PASS = "SeanLikey1";
    static final String QUERY = "SELECT PersonId, FirstName, LastName FROM employees";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(QUERY);
        ) {
            // Move cursor to the last row.
            System.out.println("Moving cursor to the last...");
            rs.last();

            // Extract data from result set
            System.out.println("Displaying record...");
            //Retrieve by column name
            int PersonId  = rs.getInt("PersonID");
            String FirstName = rs.getString("FirstName");
            String LastName = rs.getString("LastName");

            // Display values
            System.out.print("PersonId: " + PersonId);
            System.out.print(", FirstName: " + FirstName);
            System.out.println(", LastName: " + LastName);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}*/
