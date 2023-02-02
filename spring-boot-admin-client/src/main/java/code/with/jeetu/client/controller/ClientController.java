package code.with.jeetu.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class ClientController {

	/** 
	 * This method is used to check log levels
	 * */
	@GetMapping("/log")
	public String logLevel() {
		log.info("info------------");
		log.debug("debug------------");
		log.error("error------------");
		log.warn("warn------------");
		log.trace("trace------------");

		return "Test Log Level";
	}

}
