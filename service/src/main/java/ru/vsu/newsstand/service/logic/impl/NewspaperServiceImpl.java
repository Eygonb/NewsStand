package ru.vsu.newsstand.service.logic.impl;

import org.di.annotation.Autowired;
import ru.vsu.newsstand.db.repository.NewspaperRepository;
import ru.vsu.newsstand.service.logic.NewspaperService;

public class NewspaperServiceImpl implements NewspaperService {
    @Autowired
    NewspaperRepository newspaperRepository;
}
