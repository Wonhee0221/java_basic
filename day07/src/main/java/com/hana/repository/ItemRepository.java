package com.hana.repository;

import com.hana.data.ItemDto;
import com.hana.exception.DuplicatedIDException;
import com.hana.exception.NotFoundIDException;
import com.hana.frame.Repository;
import com.hana.frame.SQLcart;

import java.sql.*;
import java.util.List;

public class ItemRepository implements Repository<String, ItemDto> {
    @Override
    public ItemDto insert(ItemDto itemDto, Connection con) throws DuplicatedIDException, Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQLcart.insertItem);
            pstmt.setString(1,itemDto.getName());
            pstmt.setLong(2, itemDto.getPrice());
            pstmt.executeUpdate();
        }catch (SQLIntegrityConstraintViolationException e){
            throw new DuplicatedIDException("ERR0001");
        }catch (SQLException e){
            throw e;
        }finally {
            if (pstmt !=null){
                pstmt.close();
            }
        }
        return itemDto;
    }

    @Override
    public ItemDto update(ItemDto itemDto, Connection con) throws NotFoundIDException, Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQLcart.updateItem);
            pstmt.setLong(1, itemDto.getPrice());
            pstmt.setString(2,itemDto.getName());
            pstmt.executeUpdate();
        }catch (SQLIntegrityConstraintViolationException e){
            throw new NotFoundIDException("ERR0002");
        }
        catch (Exception e){
            throw new Exception("EXX0002");
        }finally {
            if (pstmt !=null){
                pstmt.close();
            }
        }
        return itemDto;
    }

    @Override
    public Boolean delete(String s, Connection con) throws NotFoundIDException, Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQLcart.deleteItem);
            pstmt.setString(1,s);
            pstmt.executeUpdate();
        }catch (SQLIntegrityConstraintViolationException e){
            throw new NotFoundIDException("ERR0003");
        }
        catch (Exception e){
            throw new Exception("EXX0003");
        }finally {
            if (pstmt !=null){
                pstmt.close();
            }
        }
        return null;
    }

    @Override
    public List<ItemDto> select(Connection con) throws Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQLcart.selectallItem);
            pstmt.executeUpdate();
        }catch (SQLIntegrityConstraintViolationException e){
            throw new NotFoundIDException("ERR0004");
        }
        catch (Exception e){
            throw new Exception("EXX0004");
        }finally {
            if (pstmt !=null){
                pstmt.close();
            }
        }
        return null;
    }

    @Override
    public ItemDto select(String s, Connection con) throws NotFoundIDException, Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQLcart.selectItem);
            pstmt.setString(1,s);
            pstmt.executeUpdate();
        }catch (SQLIntegrityConstraintViolationException e){
            throw new NotFoundIDException("ERR0005");
        }
        catch (Exception e){
            throw new Exception("EXX0005");
        }finally {
            if (pstmt !=null){
                pstmt.close();
            }
        }
        return null;
    }
}
