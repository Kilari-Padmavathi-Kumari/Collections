import java.sql.*;

public class CRUD {
    public static void main(String[] args) {
        // Step 1: Database connection details
        String url = "jdbc:mysql://localhost:3306/college"; // your database name
        String user = "root";   // your MySQL username
        String password = "root";  // your MySQL password

        try {
          
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database connected successfully!");

            // Step 4: Create table (optional)
            String createTable = "CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(50), marks INT)";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTable);

            // Step 5: Insert data using PreparedStatement
            String insertQuery = "INSERT INTO student (id, name, marks) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);

            // Step 6: Set values
            ps.setInt(1, 1);
            ps.setString(2, "Padma");
            ps.setInt(3, 90);

            // Step 7: Execute update
            int rows = ps.executeUpdate();

            // Step 8: Display result
            if (rows > 0) {
                System.out.println("🎉 Data inserted successfully!");
            }

            // Step 9: Close connection
            con.close();
            System.out.println("🔒 Connection closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
