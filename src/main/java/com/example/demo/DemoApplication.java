package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		log.info("sdsd");

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("x-api-key", "9edb045d-6a23-4ab7-8f9b-6321f366ea31");
		log.info("sdsd");


		String url = String.format("https://kinopoiskapiunofficial.tech/api/v2.1/films/666");
		log.info("sdsd");
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
		log.info("sdsd");
		HttpEntity<String> entity = new HttpEntity<>(headers);
		log.info("sdsd");
		return args -> {
			HttpEntity<String> response = restTemplate.exchange(
					builder.toUriString(),
					HttpMethod.GET,
					entity,
					String .class);
			log.info(response.toString());
		};
	}
}
