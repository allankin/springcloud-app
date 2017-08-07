package study.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages={"study.springcloud"})
public class UserServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceApplication.class);
	
	public static void main(String[] args) {
		logger.trace("Starting main method...");
		SpringApplication.run(UserServiceApplication.class, args);
	}
	
}