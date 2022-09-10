package edu.festu.ivankuznetsov.springsamplebo94xpri.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {
    @GetMapping("/")
    fun getHomePage():String = "index"
}
