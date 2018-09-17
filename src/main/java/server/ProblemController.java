package server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ProblemController {

    @RequestMapping("/problems")
    @ResponseBody
    public String init() {
        return "This works";
    }

    @RequestMapping("/problems/all")
    @ResponseBody
    public String allProblems() {
        return "yah";
    }
}
