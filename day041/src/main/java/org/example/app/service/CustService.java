package org.example.app.service;

import org.example.app.dao.CustDao;
import org.example.app.data.CustDto;
import org.example.app.frame.Dao;
import org.example.app.frame.Service;

import java.util.List;

public class CustService implements Service<String, CustDto> {
    Dao<String, CustDto> dao;

    public CustService() {
        dao = new CustDao();
    }


    @Override
    public int add(CustDto custDto) {
        // DB에 insert....
        dao.insert(custDto);
        // LDAP insert
        // sms
        System.out.println("send SMS...");
        // 메일...
        System.out.println("send Mail...");
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
