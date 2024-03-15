package com.hana.repository;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIDException;
import com.hana.exception.NotFoundIDException;
import com.hana.frame.ConnectionPool;
import com.hana.frame.Repository;
import com.hana.frame.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class CustRepository implements Repository<String, CustDto> {

    @Override
    public CustDto insert(CustDto custDto, Connection con) throws DuplicatedIDException, Exception {
        // 2. Connection
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQL.insertCust);
            pstmt.setString(1,custDto.getId());
            pstmt.setString(2,custDto.getPwd());
            pstmt.setString(3,custDto.getName());
            pstmt.executeUpdate();
        }catch (SQLIntegrityConstraintViolationException e){
            throw new DuplicatedIDException("ERR0001");
        }catch (SQLException e){
            throw new Exception("EXX0001");
        }finally {
            if (pstmt !=null){
                pstmt.close();
            }
        }
        return custDto;
    }


    @Override
    public CustDto update(CustDto custDto, Connection con) throws NotFoundIDException, Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQL.updateCust);
            pstmt.setString(3,custDto.getId());
            pstmt.setString(1,custDto.getPwd());
            pstmt.setString(2,custDto.getName());
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
        return custDto;
    }

    @Override
    public Boolean delete(String s, Connection con) throws NotFoundIDException, Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQL.deleteCust);
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
    public List<CustDto> select(Connection con) throws Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQL.selectallCust);
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
    public CustDto select(String s, Connection con) throws NotFoundIDException, Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQL.selectCust);
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
