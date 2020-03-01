package ms.project.first_ms_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class first_ms_projectApplication {

	public static void main(String[] args) {
		SpringApplication.run(first_ms_projectApplication.class, args);
	}

}
