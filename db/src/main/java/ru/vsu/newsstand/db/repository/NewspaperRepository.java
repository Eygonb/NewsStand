package ru.vsu.newsstand.db.repository;

import ru.vsu.newsstand.db.entity.NewspaperEntity;

import java.util.List;
import java.util.Optional;

public interface NewspaperRepository {
    Optional<NewspaperEntity> findById(Integer id);

    NewspaperEntity save(NewspaperEntity newspaperEntity);

    void deleteById(Integer id);

    List<NewspaperEntity> findAll();
}
