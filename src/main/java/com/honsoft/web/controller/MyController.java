package com.honsoft.web.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    //@GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	@GetMapping(value="/", produces={"application/xml", "application/json"})
	public String home() {

        return "This is home page";
    }
}