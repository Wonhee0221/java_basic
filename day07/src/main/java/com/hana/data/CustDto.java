package com.hana.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter, Setter toString()다 불러오는것임.
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustDto {
    private String id;
    private String pwd;
    private String name;

}
