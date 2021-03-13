package in.koderoom.microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.Map;

@SpringBootApplication
@EnableSwagger2
public class MicroService1Application {

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("in.koderoom"))
				.build()
				.apiInfo(apiMetaInfo());
	}

	private ApiInfo apiMetaInfo() {
		return new ApiInfo(
				"Koderoom Book API",
				"Api description, koderoom book.",
				"1.0",
				"Free and Open Source",
				new springfox.documentation.service.Contact("Santosh", "https://koderoom.tech","santosh@gamil.com"),
				"Free and Open Source",
				"https://koderoom.tech",
				Collections.emptyList()
		);
	}


	public static void main(String[] args) {
		SpringApplication.run(MicroService1Application.class, args);
	}

}


