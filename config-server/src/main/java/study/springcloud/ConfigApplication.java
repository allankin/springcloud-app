package study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by kim on 2017/7/20.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {
    public static void main(String[] args) {
        System.out.println("ConfigApplication startup");
        SpringApplication.run(ConfigApplication.class, args);
    }
}
