package in.upcode.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {

@RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name")String name,Model model) {
        model.addAttribute("name", name);

        return "hello";

    }
}
