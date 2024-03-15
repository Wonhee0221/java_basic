package com.hana.frame;

import com.hana.exception.DuplicatedIDException;
import com.hana.exception.IdNotFountException;
import com.hana.exception.NotFountException;

import java.util.List;

public interface Service<K,V> {
    int add(V v) throws DuplicatedIDException;
    int del(K k) throws IdNotFountException;
    int modify(V v) throws IdNotFountException;
    V get(K k) throws NotFountException;
    List<V> get() throws NotFountException;
}