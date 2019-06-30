package com.example.webfluxdemo.repository;

import com.example.webfluxdemo.model.Tweet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeevkumarsingh on 08/09/17.
 */

// это интерфейс методы которого реализует спринг и все методы позволяют работать с базой данных.
@Repository
// ReactiveMongoRepository<Tweet, String> - Твит это документ который сохраняем. Стринг - тип инта по которому устанавливается уникальность объекта.

public interface TweetRepository extends ReactiveMongoRepository<Tweet, String> {
// если нам не хватает стандарных методов мы можем написать свои абстрактные методы с ипользованием ключевых слов типа find all by where и имен классов и полей классов с которыми мы работаем.
}
