package ru.vsu.newsstand.db.repository.impl;

import ru.vsu.newsstand.db.entity.BookEntity;
import ru.vsu.newsstand.db.entity.BookEntity;
import ru.vsu.newsstand.db.repository.BookRepository;
import ru.vsu.newsstand.db.storage.StorageInMemory;

import java.util.List;
import java.util.Optional;

public class BookRepositoryImpl implements BookRepository {
    private final List<BookEntity> books;

    public BookRepositoryImpl() {
        books = new StorageInMemory().getBooks();
    }

    @Override
    public Optional<BookEntity> findById(Integer id) {
        return books.stream().filter(newspaper -> id.equals(newspaper.getId())).findAny();
    }

    @Override
    public BookEntity save(BookEntity bookEntity) {
        Optional<BookEntity> result = books.stream()
                .filter(newspaper -> bookEntity.getId().equals(newspaper.getId())).findAny();

        if (result.isPresent()) {
            result.get().setName(bookEntity.getName());
            result.get().setAuthor(bookEntity.getAuthor());
            result.get().setPublishingHouse(bookEntity.getPublishingHouse());
            result.get().setPageCount(bookEntity.getPageCount());
            result.get().setCount(bookEntity.getCount());
        } else {
            books.add(new BookEntity(
                    books.get(books.size() - 1).getId() + 1,
                    bookEntity.getName(),
                    bookEntity.getAuthor(),
                    bookEntity.getPublishingHouse(),
                    bookEntity.getPageCount(),
                    bookEntity.getCount()));
        }
        return books.get(books.size() - 1);
    }

    @Override
    public void deleteById(Integer id) {
        Optional<BookEntity> result = books.stream()
                .filter(newspaper -> id.equals(newspaper.getId())).findAny();

        result.ifPresent(books::remove);
    }

    @Override
    public List<BookEntity> findAll() {
        return books;
    }
}
