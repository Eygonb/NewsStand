package ru.vsu.newsstand.service.logic.impl;

import org.di.annotation.Autowired;
import ru.vsu.newsstand.db.repository.BookRepository;
import ru.vsu.newsstand.service.logic.JournalService;

public class JournalServiceImpl implements JournalService {
    @Autowired
    BookRepository bookRepository;
}
