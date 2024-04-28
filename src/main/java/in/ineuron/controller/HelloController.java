package in.ineuron.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class HelloController {

<<<<<<< HEAD
    @GetMapping("/welcome")
=======
    @GetMapping("/hello")
>>>>>>> 0a133b68b324515ca88a5bcc9778ca320ea533eb
    public String helloController(){
        return "Welcome from Kubernate pod container";
    }
}
