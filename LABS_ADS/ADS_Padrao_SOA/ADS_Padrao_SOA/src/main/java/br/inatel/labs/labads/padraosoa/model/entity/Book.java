package br.inatel.labs.labads.padraosoa.model.entity;

public class Book {

    private Long id;

    private String title;

    private String category;

    public Book(Long id, String title, String category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }
}
