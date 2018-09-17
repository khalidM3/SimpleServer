package dbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class WorldDB {
    private Connection conn;
    public WorldDB() {
        String url = "jdbc:postgresql://localhost:5432/world";
        Properties props = new Properties();

        try {
            this.conn = DriverManager.getConnection(url, props);
        } catch(SQLException err) {
            err.printStackTrace();
        }
    }

}
