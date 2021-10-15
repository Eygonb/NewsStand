package ru.vsu.newsstand.db.repository;

import ru.vsu.newsstand.db.entity.BookEntity;
import ru.vsu.newsstand.db.entity.JournalEntity;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Optional<BookEntity> findById(Integer id);

    BookEntity save(BookEntity bookEntity);

    void deleteById(Integer id);

    List<BookEntity> findAll();
}
