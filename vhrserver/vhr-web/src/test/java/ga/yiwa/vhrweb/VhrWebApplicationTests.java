package ga.yiwa.vhrweb;

import com.alibaba.druid.filter.AutoLoad;
import ga.yiwa.vhrservice.service.HrService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class VhrWebApplicationTests {
    

    @Autowired
    HrService hrService;
    @Test
    void contextLoads() {
        System.out.println("hello");
    }

}


