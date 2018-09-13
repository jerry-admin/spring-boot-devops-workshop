package cn.marketin.devops.workshop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	private static final Logger logger = LoggerFactory
			.getLogger(DemoController.class);

	@RequestMapping("/echo")
	public String echo(String greeting) {
		logger.info("Get {}", greeting);
		return greeting;
	}

	@RequestMapping("/ex")
	public String ex(String msg) {
		try {
			throw new IllegalArgumentException("not a valid message");
		} catch (Exception e) {
			logger.error("", e);
		}
		return msg;
	}
}
