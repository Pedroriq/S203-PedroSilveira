package br.inatel.labs.labads.padraosoa.client;

public class BookDTO {

    private Long id;

    private String title;

    private String category;

    public String getCategory() {
        return category;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
