package uz.star.february_exam_pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uz.star.february_exam_pdp.entity.book.Book;
import uz.star.february_exam_pdp.entity.user.User;
import uz.star.february_exam_pdp.service.book.BookService;
import uz.star.february_exam_pdp.service.user.UserService;

import java.util.List;

@Controller
@RequestMapping("/")
public class AuthController {
    private final UserService userService;
    private final BookService bookService;


    @Autowired
    public AuthController(UserService userService, BookService bookService) {
        this.userService = userService;
        this.bookService = bookService;
    }

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping("/registration-handle")
    public String registerHandel(
            @ModelAttribute("user") User user,
            Model model
    ) {
        boolean b = userService.addUser(user);
        if (b) {
            model.addAttribute("response", "added successfully");
        } else model.addAttribute("response", "sorry username is exist");
        return "registration-handle";
    }

    @RequestMapping("/admin-login")
    public String adminLogin() {
        return "admin-login";
    }

    @RequestMapping("/admin-login-handle")
    public String adminLoginHandel(
            @RequestParam String username, @RequestParam String password, Model model
    ) {
        User user = userService.loginAsAdmin(username, password);
        if (user == null) return "main-menu";

        List<Book> bookList = bookService.getBookList();
        model.addAttribute("bookList", bookList);
        return "admin-panel";
    }

    @RequestMapping("/add-book")
    public String addBook(
            Model model
    ) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @RequestMapping("/add-book-handle")
    public String addBookHandle(
            @ModelAttribute("book") Book book
    ) {
        bookService.addBook(book);
        return "admin-panel";
    }

    @RequestMapping("/user-login")
    public String userLogin() {
        return "user-login";
    }
}
