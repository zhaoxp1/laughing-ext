package com.laughing.extend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lucene on 2017/6/25.
 */
@Controller
@RequestMapping("/test")
public class Tester {

    @RequestMapping("/test")
    @ResponseBody
    public String getTest() {
        return "aaaaaaa";
    }
}
