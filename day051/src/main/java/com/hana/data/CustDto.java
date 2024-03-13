package com.hana.data;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor // default 생성자
@Builder
// 데이터를 담아서 보내는 역할.

public class CustDto {
    private String id;
    private String pwd;
    private String name;
}
