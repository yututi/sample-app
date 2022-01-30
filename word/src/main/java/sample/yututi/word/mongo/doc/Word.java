package sample.yututi.word.mongo.doc;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "words")
public class Word {

    @Id
    private String id;

    private String text;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private boolean isCurrentlyUsed;
}
