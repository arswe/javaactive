package abdurrahman.amigos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmigosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigosApplication.class, args);
    }
    @GetMapping("/")
    public String greet() {
        return "Hello restfull api is running ";
    }
}
