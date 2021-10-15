package ru.vsu.newsstand.service.logic.impl;

import org.di.annotation.Autowired;
import ru.vsu.newsstand.db.repository.BookRepository;
import ru.vsu.newsstand.service.logic.BookService;

public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
}
