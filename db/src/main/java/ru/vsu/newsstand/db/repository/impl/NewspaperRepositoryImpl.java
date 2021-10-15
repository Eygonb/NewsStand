package ru.vsu.newsstand.db.repository.impl;

import ru.vsu.newsstand.db.entity.JournalEntity;
import ru.vsu.newsstand.db.entity.NewspaperEntity;
import ru.vsu.newsstand.db.repository.NewspaperRepository;
import ru.vsu.newsstand.db.storage.StorageInMemory;

import java.util.List;
import java.util.Optional;

public class NewspaperRepositoryImpl implements NewspaperRepository {
    private final List<NewspaperEntity> newspapers;

    public NewspaperRepositoryImpl() {
        newspapers = new StorageInMemory().getNewspapers();
    }

    @Override
    public Optional<NewspaperEntity> findById(Integer id) {
        return newspapers.stream().filter(newspaper -> id.equals(newspaper.getId())).findAny();
    }

    @Override
    public NewspaperEntity save(NewspaperEntity newspaperEntity) {
        Optional<NewspaperEntity> result = newspapers.stream()
                .filter(newspaper -> newspaperEntity.getId().equals(newspaper.getId())).findAny();

        if (result.isPresent()) {
            result.get().setName(newspaperEntity.getName());
            result.get().setPublicationDate(newspaperEntity.getPublicationDate());
            result.get().setNumber(newspaperEntity.getNumber());
            result.get().setCount(newspaperEntity.getCount());
        } else {
            newspapers.add(new NewspaperEntity(
                    newspapers.get(newspapers.size() - 1).getId() + 1,
                    newspaperEntity.getName(),
                    newspaperEntity.getNumber(),
                    newspaperEntity.getPublicationDate(),
                    newspaperEntity.getCount()));
        }
        return newspapers.get(newspapers.size() - 1);
    }

    @Override
    public void deleteById(Integer id) {
        Optional<NewspaperEntity> result = newspapers.stream()
        .filter(newspaper -> id.equals(newspaper.getId())).findAny();

        result.ifPresent(newspapers::remove);
    }

    @Override
    public List<NewspaperEntity> findAll() {
        return newspapers;
    }
}
