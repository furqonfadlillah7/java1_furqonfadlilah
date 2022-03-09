package id.ac.uin.latihan1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api")
public class IndexController {
    @GetMapping("/hello")
    public String halo(){
        return "to be continued...";
    }
}
