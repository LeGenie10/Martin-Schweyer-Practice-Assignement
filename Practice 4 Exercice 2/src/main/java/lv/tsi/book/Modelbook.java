package lv.tsi.book;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Modelbook {
    @JsonProperty
    @Id
    Long id;
    @JsonProperty
    String author;
    @JsonProperty
    String name;

    @JsonProperty
    int copies;
}