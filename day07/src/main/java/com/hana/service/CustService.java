package com.hana.service;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIDException;
import com.hana.exception.NotFoundIDException;
import com.hana.frame.ConnectionPool;
import com.hana.frame.Service;
import com.hana.repository.CustRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustService implements Service<String, CustDto> {
    CustRepository repository;
    ConnectionPool cp;
    public CustService() {
        repository = new CustRepository();
        try {
            cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CustDto add(CustDto custDto) throws DuplicatedIDException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false); // 인서트를 하면 일단 커밋을 안한다.
            repository.insert(custDto, con);
            con.commit();
        }catch (DuplicatedIDException e){
            con.rollback();
            throw e;
        }catch (Exception e){
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public CustDto modify(CustDto custDto) throws NotFoundIDException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false); // 인서트를 하면 일단 커밋을 안한다.
            repository.update(custDto, con);
            con.commit();
        }catch (DuplicatedIDException e){
            con.rollback();
            throw e;
        }catch (Exception e){
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public Boolean remove(String s) throws NotFoundIDException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false); // 인서트를 하면 일단 커밋을 안한다.
            repository.delete(s, con);
            con.commit();
        }catch (DuplicatedIDException e){
            con.rollback();
            throw e;
        }catch (Exception e){
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public List<CustDto> get() throws Exception {
        Connection con = cp.getConnection();
        try {
            repository.select(con);
        }catch (DuplicatedIDException e){
            con.rollback();
            throw e;
        }catch (Exception e){
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public CustDto get(String s) throws NotFoundIDException, Exception {
        Connection con = cp.getConnection();
        try {
            repository.select(s, con);
        }catch (DuplicatedIDException e){
            con.rollback();
            throw e;
        }catch (Exception e){
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return null;
    }
}
