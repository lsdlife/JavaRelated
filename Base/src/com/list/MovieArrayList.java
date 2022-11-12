package com.list;

import java.util.ArrayList;
import java.util.Collection;

public class MovieArrayList {
    public static void main(String[] args) {
        //定义一个集合对象存储3个电影对象
        Collection<Movie> mvs = new ArrayList<>();
        mvs.add(new Movie("aaa", "绝世好剑", 9.2));
        mvs.add(new Movie("bbb", "精忠报国", 9.3));
        mvs.add(new Movie("ccc", "方世玉", 9.5));

        //System.out.println(mvs);
        //遍历
        mvs.forEach(movie -> System.out.println(movie.getName() + movie.getActor() + movie.getScore()));
    }
}
