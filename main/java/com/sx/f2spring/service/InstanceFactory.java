package com.sx.f2spring.service;

import com.sx.f2spring.bean.Book;

import java.util.HashMap;
import java.util.Map;

public class InstanceFactory {
    private static Map<String,Book> map = new HashMap<>();

    {
        map.put("book1", new Book(1,"<我的世界>","创世神",9.99,200));
        map.put("book2", new Book(2,"<Mysql>","张三",10.00,100));
        map.put("book3", new Book(3,"<java>","李四",7.00,300));
        map.put("book4", new Book(4,"<chrome>","铁蛋",8.88,50));
    }

    public Book getBook(String key){
        return map.get(key);
    }

}
