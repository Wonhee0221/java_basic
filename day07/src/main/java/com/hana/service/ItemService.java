package com.hana.service;


import com.hana.data.ItemDto;
import com.hana.exception.DuplicatedIDException;
import com.hana.exception.NotFoundIDException;
import com.hana.frame.ConnectionPool;
import com.hana.frame.Service;
import com.hana.repository.ItemRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ItemService implements Service<String, ItemDto> {
    ItemRepository repository;
    ConnectionPool cp;
    public ItemService() {
        repository = new ItemRepository();
        try {
            cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ItemDto add(ItemDto itemDto) throws DuplicatedIDException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false); // 인서트를 하면 일단 커밋을 안한다.
            repository.insert(itemDto, con);
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
    public ItemDto modify(ItemDto itemDto) throws NotFoundIDException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false); // 인서트를 하면 일단 커밋을 안한다.
            repository.update(itemDto, con);
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
    public List<ItemDto> get() throws Exception {
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
    public ItemDto get(String s) throws NotFoundIDException, Exception {
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
