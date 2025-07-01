package Exam_Prep;

public class JDBC_Q {
    /*
    Load JDBC Driver

Class.forName("com.mysql.cj.jdbc.Driver");


Establish Connection

Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/dbname", "username", "password");


Create Statement

Statement stmt = con.createStatement();


Execute Query

ResultSet rs = stmt.executeQuery("SELECT * FROM students");


Process ResultSet

while(rs.next()) {
    System.out.println(rs.getInt(1) + " " + rs.getString(2));
}


Close Connection

rs.close();
stmt.close();
con.close();





     public static void main(String[] args) {
        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery("SELECT id, name FROM students");

            // Process Result
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
     */
}
