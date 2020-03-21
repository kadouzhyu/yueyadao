package moon.ya.yueyadao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sys")
public class LoginController {

    @GetMapping("/ni")
    public String LoginMoon() {
        List<String> objects = new ArrayList<>();
        System.out.printf("");
        return "1234";
    }
}