package pl.wsb.library.catalog.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 120)
    private String title;

    @Column(name = "isbn", nullable = false, unique = true, length = 20)
    private String isbn;

    @Column(name = "publication_year", nullable = false)
    private Integer publicationYear;

    @Column(name = "pages", nullable = false)
    private Integer pages;

    @Column(name = "available", nullable = false)
    private Boolean available;

    protected Book() {
    }

    public Book(String title, String isbn, Integer publicationYear,
                Integer pages, Boolean available) {
        this.title = title;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public Integer getPages() {
        return pages;
    }

    public Boolean getAvailable() {
        return available;
    }
}