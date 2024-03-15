package com.hana.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data // Getter, Setter toString()다 불러오는것임.
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto {
    private String name;
    private long price;
}
