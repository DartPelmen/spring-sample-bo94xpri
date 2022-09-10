package edu.festu.ivankuznetsov.springsamplebo94xpri.entity

import javax.persistence.*

@Entity
@Table(name = "books")
data class BookEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0,
    @Column
    var title: String = "",
    @Column
    var author: String = ""
)
