package in.koderoom.microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RestService {

    @GetMapping("/")
    public String sayHello() {
        return "Say Helloooooo Again and Again";
    }

    @GetMapping("/1")
    public Map<String, String> sayHelloV2() {
        return Collections.singletonMap("title", "Hello World");
    }
}
