package edu.festu.ivankuznetsov.springsamplebo94xpri.service

import edu.festu.ivankuznetsov.springsamplebo94xpri.entity.BookEntity
import org.springframework.stereotype.Service

interface BookService {
    fun getAll():MutableList<BookEntity>
}
