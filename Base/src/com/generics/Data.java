package com.generics;

/**
 * 泛型接口
 * @param <E>
 */
public interface Data<E> {
    void add();
    void del(int id);
    void update(E e);
    E querybyid(int id);
}
