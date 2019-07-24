package com.library.dao.dbInit;

import com.library.dao.model.Book;
import com.library.dao.model.User;
import com.library.dao.repository.BookRepository;
import com.library.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/*import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;


    public DbInit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        // Delete all
        this.userRepository.deleteAll();
        this.bookRepository.deleteAll();

        // Create users
        User dan = new User("dan", "dan123","USER","", "dan@gmail.com");
        User admin = new User("admin", "admin123","ADMIN","ACCESS_TEST1,ACCESS_TEST2", "admin@gmail.com");
        User manager = new User("manager", "manager12","MANAGER","ACCESS_TEST1", "manager@gmail.com");

        //Create books
        Book un = new Book("Babylon", "Jérémie", 10.43, "Policier", 8L, true, dan);
        Book deux = new Book("Book2", "Jonas", 15.00, "Action", 8L, true, dan);
        Book trois = new Book("Book3", "Jean", 15.00, "Aventure", 8L, true, admin);


        List<User> users = Arrays.asList(dan,admin,manager);

        List<Book> books = Arrays.asList(un,deux,trois);


        // Save to db
        this.userRepository.saveAll(users);
        this.bookRepository.saveAll(books);
    }
}*/