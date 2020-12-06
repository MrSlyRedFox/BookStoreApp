package ru.rickSanchez.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.rickSanchez.entities.Book;
import ru.rickSanchez.services.BookService;

@Controller
@RequestMapping("/main_page")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public String addProduct(
            Model model
    ) {
        model.addAttribute("book", new Book());
        return "main_page";
    }
}
