package com.sunflower.piccolo.consumer;

import com.sunflower.piccolo.api.HelloRpc;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuyongde
 * @date 2019/9/16 22:06
 */
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @RestController
    static class TestController {

        @Reference
        HelloRpc helloRpc;

        @GetMapping("/test")
        public String test() {
            return helloRpc.hello("fuyongde");
        }
    }
}
