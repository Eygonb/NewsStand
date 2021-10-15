package ru.vsu.newsstand.service.model;

public class NewspaperDto {
    private Integer id;
    private String name;
    private Integer number;
    private String publicationDate;
    private Integer count;

    public NewspaperDto(Integer id, String name, Integer number, String publicationDate, Integer count) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.publicationDate = publicationDate;
        this.count = count;
    }

    public NewspaperDto(String name, Integer number, String publicationDate, Integer count) {
        this.name = name;
        this.number = number;
        this.publicationDate = publicationDate;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
