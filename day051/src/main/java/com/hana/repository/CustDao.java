package com.hana.repository;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIDException;
import com.hana.exception.IdNotFountException;
import com.hana.exception.NotFountException;
import com.hana.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class CustDao implements Dao<String, CustDto> {

    @Override
    public int insert(CustDto custDto) throws DuplicatedIDException {
        if (custDto.getId().equals("id01")){
            throw new DuplicatedIDException("EX0001");
        }
//        System.out.println("Duplicated ID Exception..."); // 문제발생 상황.
        System.out.println("Oracle DB : Inserted..." + custDto);
        return 0;
    }

    @Override
    public int delete(String s) throws IdNotFountException {
        if (s.equals("id01")){
            throw new IdNotFountException("EX0002");
        }
        System.out.println("Oracle DB :deleted..." + s);
        return 0;
    }

    @Override
    public int update(CustDto custDto)  throws IdNotFountException{
        if (custDto.getId().equals("id01")){
            throw new IdNotFountException("EX0003");
        }
        System.out.println("Oracle DB :Updated..." + custDto);
        return 0;
    }

    @Override
    public CustDto select(String s)  throws NotFountException {
        if (s.equals("id01")){
            throw new NotFountException("EX0004");
        }
        return CustDto.builder().id(s).pwd("pwd01").name("james").build();
    }

    @Override
    public List<CustDto> select() throws NotFountException{
        List list = new ArrayList<CustDto>(); // CustDto타입으로 담아서 리턴하겠다.
        list.add(CustDto.builder().id("id01").pwd("pwd01").name("james1").build());
        list.add(CustDto.builder().id("id02").pwd("pwd02").name("james2").build());
        list.add(CustDto.builder().id("id03").pwd("pwd03").name("james3").build());
        if (list.isEmpty()){
            throw new NotFountException("EX0005");
        }
        return list;
    }
}
