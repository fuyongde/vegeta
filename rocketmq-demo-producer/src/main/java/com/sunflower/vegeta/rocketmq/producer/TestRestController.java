package com.sunflower.vegeta.rocketmq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuyongde
 * @date 2019/8/25 17:48
 */
@RestController
@RequestMapping("/test")
public class TestRestController {

    @Autowired
    private SenderService senderService;

    @GetMapping
    public String send(String msg) throws Exception {
        senderService.send(msg);
        return "Success";
    }
}
