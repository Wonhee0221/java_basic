package org.example.app.frame;

import java.util.List;

public interface Dao<K,V> {
    int insert(V v); // public abstract int insert();
    int delete(K k);
    int update(V v);
    V select(K k);
    List<V> select();
}
