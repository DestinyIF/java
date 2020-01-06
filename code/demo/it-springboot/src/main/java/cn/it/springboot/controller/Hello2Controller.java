package cn.it.springboot.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fuck1")

public class Hello2Controller {

    @GetMapping("show")
    public String test(){
        return "hello springboot2";
    }


}
