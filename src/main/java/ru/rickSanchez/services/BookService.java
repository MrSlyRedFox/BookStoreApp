package ru.rickSanchez.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

import ru.rickSanchez.entities.Book;
import ru.rickSanchez.repositories.BookRepository;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findById(Integer id){ return bookRepository.findById(id);}

    public void deleteById(Integer id){
        bookRepository.deleteById(id);
    }

    public Page<Book> findAll(Specification<Book> specification, int page, int size){
        return bookRepository.findAll(specification, PageRequest.of(page,size));
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }
}
