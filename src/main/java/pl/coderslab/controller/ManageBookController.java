package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.dao.BookService;
import pl.coderslab.entity.Book;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin/books")
public class ManageBookController {

    private final BookService bookService;

    public ManageBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public String showPosts(Model model) {
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "/books/all";
    }

    @GetMapping("/{id}")
    public String showBook(@PathVariable long id, Model model) {
        Optional<Book> book = bookService.get(id);
        List<Book> books = book.map(Collections::singletonList).orElse(Collections.emptyList());
        model.addAttribute("books", books);
        return "/books/single";
    }
}
