package com.hana.frame;

import com.hana.exception.DuplicatedIDException;
import com.hana.exception.NotFoundIDException;

import java.sql.Connection;
import java.util.List;


//제너릭 사용해주는게 좋다
public interface Repository <K,V>{
    V insert(V v, Connection con) throws DuplicatedIDException, Exception;
    V update(V v, Connection con) throws  NotFoundIDException, Exception;
    Boolean delete(K k, Connection con) throws NotFoundIDException, Exception;
    List<V> select(Connection con) throws Exception;
    V select(K k, Connection con) throws NotFoundIDException, Exception;
}
