package in.ineuron.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloController(){
        return "Welcome from Kubernate pod container";
    }
}
