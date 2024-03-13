package com.hana.repository;

import com.hana.data.CustDto;
import com.hana.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class CustDao implements Dao<String, CustDto> {

    @Override
    public int insert(CustDto custDto) {
//        System.out.println("Duplicated ID Exception..."); // 문제발생 상황.
        System.out.println("Oracle DB : Inserted..." + custDto);
        return 0;
    }

    @Override
    public int delete(String s) {
        System.out.println("Oracle DB :deleted..." + s);
        return 0;
    }

    @Override
    public int update(CustDto custDto) {
        System.out.println("Oracle DB :Updated..." + custDto);
        return 0;
    }

    @Override
    public CustDto select(String s) {
        return CustDto.builder().id(s).pwd("pwd01").name("james").build();
    }

    @Override
    public List<CustDto> select() {
        List list = new ArrayList<CustDto>(); // CustDto타입으로 담아서 리턴하겠다.
        list.add(CustDto.builder().id("id01").pwd("pwd01").name("james1").build());
        list.add(CustDto.builder().id("id02").pwd("pwd02").name("james2").build());
        list.add(CustDto.builder().id("id03").pwd("pwd03").name("james3").build());
        return list;
    }
}
