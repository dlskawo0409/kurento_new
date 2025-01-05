package com.example.kurento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KurentoController {
	@GetMapping("/")
	public String index() {
		return "index.html"; // static/index.html로 자동 매핑
	}
}
