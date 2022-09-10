package edu.festu.ivankuznetsov.springsamplebo94xpri.controller

import edu.festu.ivankuznetsov.springsamplebo94xpri.service.BookService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class BooksController(private val bookService: BookService) {

    @GetMapping("/books")
    fun getAllBooks(model:Model):String {
        model.addAttribute("books",bookService.getAll())
        return "books"
    }
}
