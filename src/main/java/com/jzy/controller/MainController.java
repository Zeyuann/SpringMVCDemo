package com.jzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jzy on 16/2/3.
 */
@Controller
public class MainController {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

}
