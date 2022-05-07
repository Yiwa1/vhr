package ga.yiwa.vhrweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages = {"ga.yiwa"})
@MapperScan(basePackages = {"ga.yiwa.vhrmapper"})
@EnableTransactionManagement
public class VhrWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrWebApplication.class, args);
    }

}
