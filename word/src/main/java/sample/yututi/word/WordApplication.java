package sample.yututi.word;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class WordApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordApplication.class, args);
	}

}
