package com.generics;

import java.util.ArrayList;

/**
 * 自定义泛型类
 *
 * @param <E>
 */

public class ClassDemo<E> {
    private ArrayList lists = new ArrayList();
    public void add(E e) {
        lists.add(e);
    }
    public void remove(E e) {
        lists.remove(e);
    }
}
