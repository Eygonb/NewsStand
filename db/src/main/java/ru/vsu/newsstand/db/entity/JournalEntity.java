package ru.vsu.newsstand.db.entity;

public class JournalEntity {
    private Integer id;
    private String name;
    private Integer number;
    private String publicationDate;
    private Integer pageCount;
    private Integer count;

    public JournalEntity(Integer id, String name, Integer number, String publicationDate, Integer pageCount, Integer count) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.publicationDate = publicationDate;
        this.pageCount = pageCount;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
