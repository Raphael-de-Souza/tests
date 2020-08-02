package com.rss.tests.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author
 * <pre>
 *  Controller to redirect request to swagger-ui page
 * </pre>
 */
@Controller
public class SwagerUIController {
    @RequestMapping(value = "/")
    public String index() {
        return "redirect:swagger-ui.html";
    }
}
