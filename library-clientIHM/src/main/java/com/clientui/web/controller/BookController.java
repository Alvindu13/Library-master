package com.clientui.web.controller;

import com.clientui.beans.BookBean;
import com.clientui.beans.UserBean;
import com.clientui.web.proxies.MicroserviceConsumerProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("books")
public class BookController {

    @Autowired
    MicroserviceConsumerProxy mBookProxy;

    @Autowired
    UserDetailsService userDetailsService;


    @GetMapping
    public String allBooks(Model model, Principal principal){
        List<BookBean> books =  mBookProxy.findBooks();

        model.addAttribute("books", books);
        model.addAttribute("username", principal.getName());

        userDetailsService.loadUserByUsername(principal.getName());

        model.addAttribute("user", userDetailsService.loadUserByUsername(principal.getName()));

        return "listBooks";
    }

    @GetMapping("/user/{borrowerId}")
    public String borrowerBooks(@PathVariable Long borrowerId, Model model) {

        List<BookBean> borrowBooks = mBookProxy.borrowerBooks(borrowerId);

        model.addAttribute("borrowBooks", borrowBooks);

        return "listBorrowerBooks";
    }
}
