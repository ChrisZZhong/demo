package com.temp.demo.DTO;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponse {
    private String status;
    private String message;
}
