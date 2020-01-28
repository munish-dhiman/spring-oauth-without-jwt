package learn.spring.demo.oauth2.resourceserver.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/free")
public class ResourceServerFreeApi {

    @GetMapping
    public String free() {
        return "Get this info for free....";
    }
}
