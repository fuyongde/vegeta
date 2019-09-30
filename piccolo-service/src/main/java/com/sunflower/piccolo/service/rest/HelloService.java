package com.sunflower.piccolo.service.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fuyongde
 * @date 2019/9/21 11:11
 */
@RestController
@RequestMapping("/api/hello")
public class HelloService {

    @PostMapping
    public Map<String, Object> hello(@RequestBody People people) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(people);
        System.out.println(s);

        Map<String, Object> map = new HashMap<>(16);
        map.put("name", "傅永德");
        return map;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class People implements Serializable {
        private String name;
        private Integer age;
    }
}
