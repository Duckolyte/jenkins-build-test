package ch.build.test.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/tests")
    public String getTests() {
        return "tests";
    }

}
