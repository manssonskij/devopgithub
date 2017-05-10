package se.exjobb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsApplication {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Controller.class);

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);

		logger.info("SpringApplication Run class");

		System.out.print("Testing");
	}
}
