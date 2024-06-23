import java.sql.*;

public class DemoJDBC {

    public static void main(String args []) throws ClassNotFoundException, SQLException {
        // JDBC is a Java API that is used to connect and execute queries with the database.
        // JDBC stands for Java Database Connectivity.
        // JDBC is a part of JavaSE (Java Standard Edition).
        // JDBC API uses JDBC drivers to connect with the database.
        // There are 4 types of JDBC drivers:
        // 1. JDBC-ODBC Bridge Driver
        // 2. Native-API Driver (Partially Java Driver)
        // 3. Network Protocol Driver (Fully Java Driver)
        // 4. Thin Driver (Fully Java Driver)

        // JDBC API provides the following interfaces and classes:
        // 1. DriverManager class
        // 2. Connection interface
        // 3. Statement interface
        // 4. ResultSet interface
        // 5. SQLException class

        // Steps to connect to the database in Java using JDBC:
        // 1. Load and register the driver
        // 2. Create a connection
        // 3. Create a statement
        // 4. Execute the query
        // 5. Process the results
        // 6. Close the connection

        // Example of connecting to a MySQL database using JDBC:
        // import java.sql.Connection;
        // import java.sql.DriverManager;
        // import java.sql.SQLException;
        //
        // public class Main {
        //     public static void main(String[] args) {
        //         String url = "jdbc:mysql://localhost:3306/database_name";
        //
        //         try {
        //             Connection connection = DriverManager.getConnection(url, "username", "password");
        //             System.out.println("Connected to the database!");
        //         } catch (SQLException e) {
        //             System.out.println("Connection failed!");
        //             e.printStackTrace();
        //         }
        //     }
        // }

        // JDBC is a powerful API that allows Java applications to interact with databases.
        // It is widely used in enterprise applications for data storage and retrieval.
        // JDBC provides a standard way to connect to any relational database.
        // It is a key component of Java EE (Java Enterprise Edition) applications.
        // JDBC is a low-level API that provides direct access to the database.
        // It is a fundamental technology for Java developers working with databases.
        // JDBC is a mature and stable API that has been around for many years.
        // It is supported by a wide range of database vendors and tools.
        // JDBC is an essential skill for Java developers working on database-driven applications.
        // It is a core technology that every Java developer should be familiar with.
        // JDBC is a key part of the Java ecosystem and is used in many Java applications.

        // Section5 JDBC
        // Steps:
        // 1. Import packages
        // 2. Load driver
        // 3. Register driver
        // 4. Create Connection
        // 5. Create Statement
        // 6. Execute Statement
        // 7. Close Connection

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "";
        String query = "SELECT * FROM student";

        int sid = 102;
        String sname = "Unluck";
        int marks = 12;

        //String insertQuery = "INSERT INTO student (sid, sname, marks) VALUES (5, 'Gin', 25)";
        //String updateQuery = "UPDATE student SET marks = 26 WHERE sid = 5";
        //String deleteQuery = "DELETE FROM student WHERE sid = 2";
        //String insertQuery = "INSERT INTO student (sid, sname, marks) VALUES (" + sid + ", '" + sname + "', " + marks + ")";

        String insertQuery = "INSERT INTO student (sid, sname, marks) VALUES (?, ?, ?)";

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,user,password);

        System.out.println("Connected to the database!");

        // Problem with this approach is that it is vulnerable to SQL Injection
        // Use PreparedStatement instead
        // PreparedStatement is a subinterface of Statement
        // It is used to execute parameterized queries
        // It is more secure and efficient than Statement
        // It prevents SQL Injection attacks
        // It is precompiled and cached by the database
        // It is faster than Statement for repeated execution of the same query
        // It is used to execute queries with parameters
        // It is used to execute queries with placeholders
        Statement stmt = con.createStatement();
        /*PreparedStatement stmt = con.prepareStatement(insertQuery);
        stmt.setInt(1, sid);
        stmt.setString(2, sname);
        stmt.setInt(3, marks);*/

        //boolean status = stmt.execute(insertQuery);
        //boolean status = stmt.execute();
        //boolean status = stmt.execute(updateQuery);
        //boolean status = stmt.execute(deleteQuery);

        //System.out.println("Query executed successfully!" + status);

        // Execute the query using stmt.executeUpdate(insertQuery);
        // Get the result using ResultSet rs = stmt.executeQuery(query);
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            // can also use column name
        }

        // CRUD Operations
        // Create - INSERT
        // Read - SELECT
        // Update - UPDATE
        // Delete - DELETE

        // Example of INSERT query
        // String insertQuery = "INSERT INTO student (id, name, age) VALUES (4, 'John', 25)";

        // Example of UPDATE query
        // String updateQuery = "UPDATE student SET age = 26 WHERE id = 4";

        // Example of DELETE query
        // String deleteQuery = "DELETE FROM student WHERE id = 4";

        // Execute the query using stmt.executeUpdate(insertQuery);


        con.close();
        System.out.println("Connection closed!");


    }

}
