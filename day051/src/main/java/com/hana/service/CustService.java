package com.hana.service;


import com.hana.data.CustDto;
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
    public int add(CustDto custDto) {
        dao.insert(custDto);
        System.out.println("send SMS...");
        return 0;
    }

    @Override
    public int del(String s) {
        dao.delete(s);
        return 0;
    }

    @Override
    public int modify(CustDto custDto) {
        dao.update(custDto);
        System.out.println("send SMS...");
        System.out.println("send Mail...");
        return 0;
    }

    @Override
    public CustDto get(String s) {
        return dao.select(s);
    }

    @Override
    public List<CustDto> get() {
        return dao.select();
    }

}
