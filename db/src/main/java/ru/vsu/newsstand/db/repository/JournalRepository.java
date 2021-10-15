package ru.vsu.newsstand.db.repository;

import ru.vsu.newsstand.db.entity.JournalEntity;

import java.util.List;
import java.util.Optional;

public interface JournalRepository {
    Optional<JournalEntity> findById(Integer id);

    JournalEntity save(JournalEntity journalEntity);

    void deleteById(Integer id);

    List<JournalEntity> findAll();
}
