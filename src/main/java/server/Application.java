package server;

import dbs.ThinkerDB;
import models.Problem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        ThinkerDB db = new ThinkerDB();
//        List<Problem> problems = db.getAllProblems();
//        for (Problem  problem : problems) {
//            System.out.println(problem.toString());
//        }
    }
}
