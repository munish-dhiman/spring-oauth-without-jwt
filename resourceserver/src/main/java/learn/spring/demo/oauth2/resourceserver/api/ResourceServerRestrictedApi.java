package learn.spring.demo.oauth2.resourceserver.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResourceServerRestrictedApi {

    @GetMapping("/restricted")
    public String notFree() {
        return "Its is not for everyone. You are special";
    }
}
