package com.exercise.day1.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller_ex1 {
@GetMapping("Name")
public String Name()
{   
	
	return "welcome";
}
}
