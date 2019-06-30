package com.example.webfluxdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


/**
 * Created by rajeevkumarsingh on 08/09/17.
 */
// с каждым объектом класс Твит будет ассоциирована запись в коллекции
@Document(collection = "tweets")
public class Tweet {

    //уникальность каждого документа в коллекции гарантирована айдишником. Именно по нему будем отличать одну запись от другой.
    @Id
    private String id;

    // валидаторы которые указывают как заполнять то или иное поле
    @NotBlank
    @Size(max = 140)
    private String text;

    @NotNull
    private Date createdAt = new Date();

    public Tweet() {

    }

    public Tweet(String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
