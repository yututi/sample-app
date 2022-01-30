package sample.yututi.word.mongo.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;
import sample.yututi.word.mongo.doc.Word;

@Repository
public interface WordRepository 
  extends ReactiveMongoRepository<Word, String> {
 
    Mono<Word> findFirstByIsCurrentlyUsedTrue();
}