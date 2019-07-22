package com.clientui.beans;

import java.math.BigDecimal;

public class BookBean {

    private Long id;
    private String name;
    private String author;
    private BigDecimal price;

    //Genre du livre
    private String genre;

    //Nombre d'exemplaires
    private Long quantity;

    public BookBean() {
    }

    public BookBean(Long id, String name, String author, BigDecimal price, String genre, Long quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
