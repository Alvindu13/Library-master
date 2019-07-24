package com.library.dao.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String author;
    private Double price;

    //Genre du livre
    private String genre;

    //Nombre d'exemplaires
    private Long quantity;

    @Column(columnDefinition = "boolean default true")
    private Boolean available;

    @ManyToOne
    private User borrower;

    public Book(String name, String author, Double price, String genre, Long quantity, Boolean available, User borrower) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.quantity = quantity;
        this.available = available;
        this.borrower = borrower;
    }

    //ou boolean
    //private int borrowCount;

    /*
        //Début du prêt
        private Date borrowDate;
     */

}


