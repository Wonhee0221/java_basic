package com.hana.frame;

import java.util.List;

public interface Dao<K,V> {
    /**
     * 2024.3.13
     * name : WHHAN
     * @param v : CustDto
     * @return int
     */
    int insert(V v); // public abstract int insert();
    int delete(K k);
    int update(V v);
    V select(K k);
    List<V> select();
}
