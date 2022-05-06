package lv.tsi.finaltask;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    private @Id @JsonProperty Integer id;

    private @JsonProperty String Name;

    private @JsonProperty String Author;

    private @JsonProperty Integer pages;
    private @JsonProperty Double price;
    public Book() {}
    public Book(Integer id, String Name, String Author, Integer pages, Double price){
        this.id = id;
        this.Name = Name;
        this.Author = Author;
        this.pages = pages;
        this.price = price;
    }

    public Integer getId(){
        return this.id;
    }

    public Integer getPages(){
        return this.pages;
    }
    public double getPrice() {
        return this.price;
    }
}


