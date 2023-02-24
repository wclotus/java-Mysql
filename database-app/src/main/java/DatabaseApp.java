import java.sql.*;

public class DatabaseApp {
    private static final String PORT = "3306";
    private static final String TABLE = "Customers";
    private static final String DATABASE = "WClotus";
    private static final String USER = "root";
    private static final String PASSWORD = "SeanLikey1";

    public static void main(String[] args) throws SQLException {
        String URL = "jdviewbc:mysql://localhost:" + PORT + "/" + DATABASE;

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = con.createStatement()
        ) {
            insert(stmt);
            update(stmt);
            search(stmt);
            delete(stmt);
        }
    }

    private static void insert(Statement stmt) throws SQLException {
        String insertSql = "INSERT INTO " + TABLE +
                "(Name, Address, City, PostalCode, Country) " +
                "VALUES ('Foo Bar', 'Mataderos 2312', 'México D.F.', '05023', 'Mexico')";
        int result = stmt.executeUpdate(insertSql);
        if (result > 0) System.out.println("Insert customer Foo Bar successfully");
    }

    private static void update(Statement stmt) throws SQLException {
        String updateSql = "UPDATE " + TABLE + " SET Country = 'US' WHERE Name= 'Foo Bar'";
        int result = stmt.executeUpdate(updateSql);
        if (result > 0) System.out.println("Update customer Foo Bar successfully");
    }

    private static void search(Statement stmt) throws SQLException {
        String searchSql = "SELECT * FROM " + TABLE + " WHERE Name = 'Foo Bar'";
        ResultSet rs = stmt.executeQuery(searchSql);
        if (rs.isBeforeFirst())
            System.out.println("Customer Foo Bar found");
        else
            System.out.println("Customer Foo Bar not found");
    }

    private static void delete(Statement stmt) throws SQLException {
        String deleteSql = "DELETE FROM " + TABLE + " WHERE Name = 'Foo Bar'";
        int result = stmt.executeUpdate(deleteSql);
        if (result > 0) System.out.println("Delete customer Foo Bar successfully");
    }
}
