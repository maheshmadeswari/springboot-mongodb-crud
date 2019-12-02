/**
 * 
 */
package com.bosch.blogpoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MSL6COB
 *
 */
@RestController
@RequestMapping(value = "/")
public class HomeController {

  @GetMapping("/")
  public String welcome() {
    return "Welcome to BSP DashBoard";
  }
}
