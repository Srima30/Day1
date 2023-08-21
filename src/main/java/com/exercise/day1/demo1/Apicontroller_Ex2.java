package com.exercise.day1.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller_Ex2 {
@GetMapping("getName")
public String getName(@RequestParam String Name)
{
	return "Welcome "+ Name +" !";
}
}
