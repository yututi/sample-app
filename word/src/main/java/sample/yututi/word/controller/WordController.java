package sample.yututi.word.controller;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;
import sample.yututi.word.mongo.repo.WordRepository;

@Configuration
public class WordController {

    @Autowired
    private WordRepository repo;

    @Bean
    RouterFunction<ServerResponse> routes() {
        return route(GET("/word"), req -> ok().body(getWord(), String.class));
    }

    private Mono<String> getWord() {
        return repo.findFirstByIsCurrentlyUsedTrue().map(word -> word.getText());
    }
}
