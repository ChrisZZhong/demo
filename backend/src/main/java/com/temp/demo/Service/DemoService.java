package com.temp.demo.Service;

import com.temp.demo.DTO.MessageRequest;
import com.temp.demo.Dao.MongoDemoRepo;
import com.temp.demo.Entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private MongoDemoRepo repository;

    @Autowired
    public DemoService(MongoDemoRepo repository) {
        this.repository = repository;
    }

    public void saveOrUpdateMessage(Message message) {
        repository.save(message);
    }
}
