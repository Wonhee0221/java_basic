package org.example.app.data;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder
public class ItemDto {
    private long id;
    private String name;
    private long price;
}
