package com.hana.frame;

import com.hana.exception.DuplicatedIDException;
import com.hana.exception.IdNotFountException;
import com.hana.exception.NotFountException;

import java.util.List;

public interface Dao<K,V> {
    /**
     * 2024.3.13
     * name : WHHAN
     * @param v : CustDto
     * @return int
     */
    int insert(V v) throws DuplicatedIDException; // public abstract int insert();
    int delete(K k) throws IdNotFountException;
    int update(V v) throws IdNotFountException;;
    V select(K k) throws NotFountException;;
    List<V> select()throws NotFountException;
}
