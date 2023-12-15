package com.temp.demo.Controller;

import com.temp.demo.DTO.MessageRequest;
import com.temp.demo.DTO.MessageResponse;
import com.temp.demo.Entity.Message;
import com.temp.demo.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@CrossOrigin(origins = "*")
public class demoController {

    private DemoService demoService;

    @Autowired
    public demoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @PostMapping("/message")
    public ResponseEntity<MessageResponse> getMessage(@RequestBody MessageRequest request) {
        Message message = Message.builder()
                .message(request.getMessage())
                .name(request.getName())
                .email(request.getEmail())
                .build();

        demoService.saveOrUpdateMessage(message);

        return ResponseEntity.ok(
                MessageResponse.builder()
                        .message("message sent")
                        .status("success")
                        .build()
        );
    }
}
