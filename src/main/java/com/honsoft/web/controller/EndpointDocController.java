package com.honsoft.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Controller
public class EndpointDocController {
	private final List<RequestMappingHandlerMapping> handlerMappingList;

	@Autowired
	public EndpointDocController(List<RequestMappingHandlerMapping> handlerMappingList) {
		this.handlerMappingList = handlerMappingList;
	}

	@RequestMapping(value = "/endpointdoc", method = RequestMethod.GET)
	public void show(Model model) {
		int idx = 0;
		for (RequestMappingHandlerMapping handlerMapping : handlerMappingList) {
			model.addAttribute("handlerMethods" + idx++, handlerMapping.getHandlerMethods());
		}
	}

	public void logMappings() {
		for (RequestMappingHandlerMapping handlerMapping : handlerMappingList) {
			System.out.println(handlerMapping.getHandlerMethods());
		}
	}
}