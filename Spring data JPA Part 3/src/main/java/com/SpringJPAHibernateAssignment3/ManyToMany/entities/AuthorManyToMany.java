package com.SpringJPAHibernateAssignment3.ManyToMany.entities;

import com.SpringJPAHibernateAssignment3.Address;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "author_many_to_many")
public class AuthorManyToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author_id;

    private String name;

    @Embedded
    Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book_many_to_many",
            joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "book_id"))
    List<BookManyToMany> books;

    public AuthorManyToMany() {

    }

    public AuthorManyToMany(Integer author_id, String name, Address address, List<BookManyToMany> books) {
        this.author_id = author_id;
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<BookManyToMany> getBooks() {
        return books;
    }

    public void setBooks(List<BookManyToMany> books) {
        this.books = books;
    }

}
