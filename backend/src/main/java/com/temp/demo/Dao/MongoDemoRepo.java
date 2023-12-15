package com.temp.demo.Dao;

import com.temp.demo.Entity.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MongoDemoRepo extends MongoRepository<Message, String> {
    Optional<Message> findMessageByMessage(String message);

    Optional<Message> findMessageByMessageIgnoreCase(String message);

    @Query(value = "{name: ?0}")
    List<Message> findMessagesByName(String name);



}