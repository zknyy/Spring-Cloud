package me.liangzhipeng.springcloud.example.c3hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //省略 getter setter
public class Book {

    @Value("${book.name}")
    private String name;

    @Value("${book.author}")
    private String author;

    @Value("${book.desc}")
    private String desc;

}
