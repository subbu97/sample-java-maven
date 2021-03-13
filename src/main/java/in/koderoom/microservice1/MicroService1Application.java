package in.koderoom.microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class MicroService1Application {

	@GetMapping("/")
	public String sayHello() {
		return "Say Helloooooo Again and Again";
	}

	@GetMapping("/1")
	public Map<String, String> sayHelloV2() {
		return Collections.singletonMap("title", "Hello World");
	}


	public static void main(String[] args) {
		SpringApplication.run(MicroService1Application.class, args);
	}

}
