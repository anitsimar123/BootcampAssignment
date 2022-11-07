package com.SpringJPAHibernateAssignment3.OneToOne.entities;

import com.SpringJPAHibernateAssignment3.Address;

import javax.persistence.*;


@Entity
@Table(name = "author_one_to_one")
public class AuthorOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author_id;

    private String name;

    @Embedded
    Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    BookOneToOne bookOneToOne;

    public AuthorOneToOne() {

    }

    public AuthorOneToOne(Integer author_id, String name, Address address, BookOneToOne bookOneToOne) {
        this.author_id = author_id;
        this.name = name;
        this.address = address;
        this.bookOneToOne = bookOneToOne;
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

    public BookOneToOne getBookOneToOne() {
        return bookOneToOne;
    }

    public void setBookOneToOne(BookOneToOne bookOneToOne) {
        this.bookOneToOne = bookOneToOne;
    }
}
