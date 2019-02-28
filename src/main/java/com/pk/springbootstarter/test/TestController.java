package com.pk.springbootstarter.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author PradheepKumarA
 * @date 2019-02-28
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public static String toTest() {
        return "It's Working";
    }
}
