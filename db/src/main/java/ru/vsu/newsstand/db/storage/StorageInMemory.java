package ru.vsu.newsstand.db.storage;

import org.di.annotation.Singleton;
import ru.vsu.newsstand.db.entity.BookEntity;
import ru.vsu.newsstand.db.entity.JournalEntity;
import ru.vsu.newsstand.db.entity.NewspaperEntity;

import java.util.ArrayList;
import java.util.List;

public class StorageInMemory {
    private final List<BookEntity> books;
    private final List<JournalEntity> journals;
    private final List<NewspaperEntity> newspapers;

    public StorageInMemory() {
        this.books = new ArrayList<>() {
            {
                add(new BookEntity(1, "Хребты безумия", "Говард Филлипс Лавкрафт", "АСТ", 480, 7));
                add(new BookEntity(2, "Зов Ктулху", "Говард Филлипс Лавкрафт", "АСТ", 480, 5));
                add(new BookEntity(3, "Затаившийся страх", "Говард Филлипс Лавкрафт", "АСТ", 512, 10));
            }
        };

        this.journals = new ArrayList<>() {
            {
                add(new JournalEntity(1, "Знание-сила", 8, "08.2021", 130, 20));
                add(new JournalEntity(2, "Знание-сила", 9, "09.2021", 130, 20));
                add(new JournalEntity(3, "Знание-сила", 10, "10.2021", 130, 20));
            }
        };

        this.newspapers = new ArrayList<>() {
            {
                add(new NewspaperEntity(1, "Ведомости", 1, "08.10.2021", 50));
                add(new NewspaperEntity(2, "Ведомости", 2, "09.10.2021", 50));
                add(new NewspaperEntity(3, "Ведомости", 3, "10.10.2021", 50));
            }
        };
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public List<JournalEntity> getJournals() {
        return journals;
    }

    public List<NewspaperEntity> getNewspapers() {
        return newspapers;
    }
}
