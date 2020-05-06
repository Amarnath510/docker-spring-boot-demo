package com.docker.dockerspringbootdemo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(HelloController.PATH)
public class HelloController {

   public static final String PATH = "/hello";

   @GetMapping("/greet")
   public String test() {
      return "Hello World!!!";
   }
}
