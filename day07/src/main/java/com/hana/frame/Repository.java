package com.hana.frame;

import com.hana.exception.DuplicatedIDException;
import com.hana.exception.NotFoundIDException;

import java.util.List;


//제너릭 사용해주는게 좋다
public interface Repository <K,V>{
    V insert(V v) throws DuplicatedIDException, Exception;
    V update(V v) throws  NotFoundIDException, Exception;
    Boolean delete(K k) throws NotFoundIDException, Exception;
    List<V> select() throws Exception;
    V select(K k) throws NotFoundIDException, Exception;
}
