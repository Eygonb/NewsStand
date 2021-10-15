package ru.vsu.newsstand.db.repository.impl;

import ru.vsu.newsstand.db.entity.JournalEntity;
import ru.vsu.newsstand.db.entity.JournalEntity;
import ru.vsu.newsstand.db.repository.JournalRepository;
import ru.vsu.newsstand.db.storage.StorageInMemory;

import java.util.List;
import java.util.Optional;

public class JournalRepositoryImpl implements JournalRepository {
    private final List<JournalEntity> journals;

    public JournalRepositoryImpl() {
        journals = new StorageInMemory().getJournals();
    }

    @Override
    public Optional<JournalEntity> findById(Integer id) {
        return journals.stream().filter(newspaper -> id.equals(newspaper.getId())).findAny();
    }

    @Override
    public JournalEntity save(JournalEntity journalEntity) {
        Optional<JournalEntity> result = journals.stream()
                .filter(newspaper -> journalEntity.getId().equals(newspaper.getId())).findAny();

        if (result.isPresent()) {
            result.get().setName(journalEntity.getName());
            result.get().setNumber(journalEntity.getNumber());
            result.get().setPublicationDate(journalEntity.getPublicationDate());
            result.get().setCount(journalEntity.getCount());
        } else {
            journals.add(new JournalEntity(
                    journals.get(journals.size() - 1).getId() + 1,
                    journalEntity.getName(),
                    journalEntity.getNumber(),
                    journalEntity.getPublicationDate(),
                    journalEntity.getPageCount(),
                    journalEntity.getCount()));
        }
        return journals.get(journals.size() - 1);
    }

    @Override
    public void deleteById(Integer id) {
        Optional<JournalEntity> result = journals.stream()
                .filter(newspaper -> id.equals(newspaper.getId())).findAny();

        result.ifPresent(journals::remove);
    }

    @Override
    public List<JournalEntity> findAll() {
        return journals;
    }
}
