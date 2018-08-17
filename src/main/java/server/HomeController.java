package server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    @RequestMapping("/add/{n1}+{n2}")
    public String add( @PathVariable int n1, @PathVariable int n2, Model model ) {
        model.addAttribute("n1", n1);
        model.addAttribute("n2", n2);
        model.addAttribute("result",  n1 + n2);
        return "add";
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(@RequestParam(name="n1") int n1, @RequestParam(name="n2") int n2) {
        return n1 + n2;
    }

    @RequestMapping("/multiply/{a}x{b}")
    @ResponseBody
    public int multiply(@PathVariable int a, @PathVariable int b) {
        return a * b;
    }
}
