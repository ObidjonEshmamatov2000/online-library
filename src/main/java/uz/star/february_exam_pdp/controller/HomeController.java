package uz.star.february_exam_pdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
    }

    @RequestMapping("/main-menu")
    public String showMain() {
        return "main-menu";
    }
}
