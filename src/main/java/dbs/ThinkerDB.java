package dbs;


import models.Problem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ThinkerDB {
    private Connection conn;
    public ThinkerDB() {
        String url = "jdbc:postgresql://localhost:5432/Thinker";
        Properties props = new Properties();
        try {
            this.conn = DriverManager.getConnection(url, props);
        } catch( SQLException e) {
            e.printStackTrace();
        }
    }

    public  List<Problem> getAllProblems() {
        List<Problem> problems = new ArrayList<>();

        try {
            Statement sql = this.conn.createStatement();
            ResultSet results = sql.executeQuery("SELECT * FROM Problems");

            while(results.next() ) {
                Problem problem = new Problem();
                problem.content = results.getString("content");
                problems.add(problem);
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
        return problems;
    }
}
