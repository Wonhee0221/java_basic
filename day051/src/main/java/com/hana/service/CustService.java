package com.hana.service;


import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIDException;
import com.hana.exception.IdNotFountException;
import com.hana.exception.NotFountException;
import com.hana.frame.Dao;
import com.hana.frame.Service;
import com.hana.repository.CustDao;

import java.util.List;

public class CustService implements Service<String, CustDto> {
    Dao<String, CustDto> dao;

    public CustService() {
        dao = new CustDao();
    }


    @Override
    public int add(CustDto custDto) throws DuplicatedIDException {
        System.out.println("Start TR...");
        try {
            dao.insert(custDto);
            System.out.println("Commint...");
        }catch (DuplicatedIDException e){
            System.out.println("ROllback...");
            throw e;
        }finally {
            System.out.println("End TR...");
        }
        System.out.println("Seed SMS...");
        return 0;
    }

    @Override
    public int del(String s) throws IdNotFountException {
        try {
            dao.delete(s);
            System.out.println("Delete...");
        }catch (IdNotFountException e){
            System.out.println("에러");
            throw e;
        }
        return 0;
    }

    @Override
    public int modify(CustDto custDto) throws IdNotFountException {
        try {
            dao.update(custDto);
            System.out.println("Update...");
        }catch (IdNotFountException e){
            System.out.println("에러");
            throw e;
        }finally {
            System.out.println("send SMS...");
            System.out.println("send Mail...");
        }
        return 0;
    }

    @Override
    public CustDto get(String s) throws NotFountException {
        try {
            System.out.println("get...");
            return dao.select(s);
        }catch (NotFountException e){
            System.out.println("에러");
            throw e;
        }finally {
            System.out.println("send SMS...");
            System.out.println("send Mail...");
        }

    }

    @Override
    public List<CustDto> get() throws NotFountException {
        try {
            System.out.println("get...");
            return dao.select();
        }catch (NotFountException e){
            System.out.println("에러");
            throw e;
        }finally {
            System.out.println("send SMS...");
            System.out.println("send Mail...");
        }
    }

}
