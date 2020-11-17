package com.nytstories.hashim.stories;

import com.nytstories.hashim.stories.dto.NytSeries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StoriesApplication {

	private static final Logger log = LoggerFactory.getLogger(StoriesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StoriesApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			NytSeries quote = restTemplate.getForObject(
					"https://api.nytimes.com/svc/topstories/v2/home.json?api-key=5Juyps8ID6qTGAC1bcsuk00GB6RfOzer", NytSeries.class);
			log.info(quote.toString());
		};
	}
}
