package kr.co.wjdgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringGithubActionAppApplication {
    @Value("${spring.application.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;
    public static void main(String[] args) {
        SpringApplication.run(SpringGithubAppApplication.class, args);
    }
    @GetMapping("/")
    public String index(){
        return appName+"-"+appVersion;
    }
}