package com.chatroom.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Message {
    private String name;
    private String content;

}
