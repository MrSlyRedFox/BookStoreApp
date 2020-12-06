package ru.rickSanchez.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
     * Данная аннотация @NotEmpty
     * AlexanderAM, [04.12.20 16:21]
     * Когда мы не хотим, чтобы поле было пустое
     * не null а именно пустое
     *
     * AlexanderAM, [04.12.20 16:23]
     * @NotNull: a constrained CharSequence,
     * Collection, Map, or Array is valid as
     * long as it's not null, but it can be empty
     *
     * @NotEmpty: a constrained CharSequence,
     * Collection, Map, or Array is valid as long
     * as it's not null and its size/length is
     * greater than zero
     *
     * @NotBlank: a constrained String is valid
     * as long as it's not null and the trimmed
     * length is greater than zero
     * */
    //@NotEmpty
    @Column(name = "title")
    private String title;

//    @ManyToMany
//    @JoinColumn(name = "author_id")
//    private List<Author> author_id;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    public Book() {
    }

    public Book(String title, List<Author> author_id, String description, double price) {
        this.title = title;
        //this.author_id = author_id;
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
