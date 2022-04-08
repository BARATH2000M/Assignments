package com.springSecuritytwo.Securitytwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeResource {

    @GetMapping("/")
    public String newuser(){

        return ("<h1>Welcome new user</h1>");
    }

    @GetMapping("/user")
    public String user(){

        return ("<h1>Welcome user</h1>");
    }

    @GetMapping("/admin")
    public String admin(){

        return ("<h1>Welcome admin</h1>");
    }

    @GetMapping("/barath")
    public String barath(){

        return ("<h1>Welcome barath</h1>");
    }

}