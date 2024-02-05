package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
@Autowired
    private BookDao bookDao;

    public Boolean save(Book book) {

        return bookDao.save(book)>0;
    }

    public Boolean update(Book book) {
        return bookDao.update(book)>0;

    }

    public Boolean delete(Integer id) {

        return bookDao.delete(id)>0;
    }

    public Book getById(Integer id) {
        Book book = bookDao.getById(id);
        return book;
    }

    public List<Book> getAll() {
        List<Book> books = bookDao.getAll();
        return books;
    }
}
