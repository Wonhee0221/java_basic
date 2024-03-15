package com.hana.frame;

import com.hana.exception.DuplicatedIDException;
import com.hana.exception.NotFoundIDException;

import java.util.List;

public interface Service <K,V>{
    V add(V v) throws DuplicatedIDException, Exception;
    V modify(V v) throws NotFoundIDException, Exception;
    Boolean remove(K k) throws NotFoundIDException, Exception;
    List<V> get() throws Exception;
    V get(K k) throws NotFoundIDException, Exception;
}
