package cn.it.springboot.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fuck")

public class HelloController {

    @GetMapping("show")
    public String test(){
        return "hello springboot1";
    }


}
