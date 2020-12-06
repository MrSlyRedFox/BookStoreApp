package ru.rickSanchez.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "books_tbl")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer book_id;

    /**
     * Данная аннотация @NotEmpty (посмотреть в уроке 3)
     * */
    //@NotEmpty
    @Column(name = "title")
    private String title;

    @ManyToMany
    @Column(name = "author_id")
    private String author_id;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    public Book() {
    }

    public Book(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "book_id=" + book_id + ", title='" + title + '\'' + ", description='" + description + '\'' + ", price=" + price + '}';
    }
}
