package com.labs.demo.entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.Immutable;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Immutable
@Table(name = "books_rank") // The name of the view
public class BooksRank {

    @Id
    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "rate")
    private BigDecimal rate;

    @Column(name = "sold")
    private Long sold;

    @Column(name = "genres")
    private List<String> genres;

    // Getters and Setters

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Long getSold() {
        return sold;
    }

    public void setSold(Long sold) {
        this.sold = sold;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
}