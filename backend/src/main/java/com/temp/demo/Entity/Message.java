package com.temp.demo.Entity;
import lombok.*;
//import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Message {
    private String id;
    private String message;
    private String name;
    private String email;
}
