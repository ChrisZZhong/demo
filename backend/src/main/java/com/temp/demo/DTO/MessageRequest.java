package com.temp.demo.DTO;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "message")
public class MessageRequest {
    private String message;
    private String name;
    private String email;
}
