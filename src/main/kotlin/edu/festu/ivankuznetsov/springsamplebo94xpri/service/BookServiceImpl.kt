package edu.festu.ivankuznetsov.springsamplebo94xpri.service

import edu.festu.ivankuznetsov.springsamplebo94xpri.entity.BookEntity
import edu.festu.ivankuznetsov.springsamplebo94xpri.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookServiceImpl(private val bookRepository: BookRepository): BookService {
    init {
        bookRepository.saveAll(mutableListOf(BookEntity(1,"Bible","no"),BookEntity(2,"Faust","Gete"),BookEntity(3,"Art of Programming","Knuth")))

    }
    override fun getAll():MutableList<BookEntity> {
        return bookRepository.findAll()
    }
}
