package com.exercise.day1.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller_ex3 {
  @GetMapping("color")
  public String getFav()
  {
	  String Favcolour="Black";
	  return "Hi,"+Favcolour+" is my favoooo!!!";
  }
}
