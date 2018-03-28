package com.wekj.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yw4558
 * @create 2017-11-22 9:56
 */

@RestController
public class ServiceHello {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
