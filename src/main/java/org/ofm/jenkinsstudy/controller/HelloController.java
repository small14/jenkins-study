package org.ofm.jenkinsstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/ip")
    public String ip(HttpServletRequest request){
        return request.getRemoteHost();
    }

}
