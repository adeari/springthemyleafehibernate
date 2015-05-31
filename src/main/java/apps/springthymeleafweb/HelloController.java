/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps.springthymeleafweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.Service;

/**
 *
 * @author ade
 */
@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    Service service;
    
     @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String getMovie(@PathVariable String name, ModelMap model) {
        service.get();
    model.addAttribute("name", name);
    return "hello";
    }
    //handle page 404
    @RequestMapping(value = "/**", method = RequestMethod.GET)
    public String getMovie() {
        return "in404";
    }
    
}
