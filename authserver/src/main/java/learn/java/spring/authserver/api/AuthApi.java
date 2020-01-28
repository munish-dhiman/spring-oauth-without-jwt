package learn.java.spring.authserver.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthApi {

    @GetMapping
    public String testApi() {
        return "It is first test method";
    }
}
