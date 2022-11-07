package com.SpringJPAHibernateAssignment3.OneToMany.entities;

import com.SpringJPAHibernateAssignment3.Address;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "author_one_to_many")
public class AuthorOneToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Embedded
    Address address;

    @OneToMany(mappedBy = "authorOneToMany",cascade = CascadeType.ALL)
    Set<SubjectOneToMany> subjects;

    @OneToMany(mappedBy = "authorOneToMany",cascade = CascadeType.ALL)
    Set<BookOneToMany> books;

    public AuthorOneToMany() {

    }

    public AuthorOneToMany(Integer id, String name, Address address, Set<SubjectOneToMany> subjects, Set<BookOneToMany> books) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.subjects = subjects;
        this.books = books;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookOneToMany> getBooks() {
        return books;
    }

    public void setBooks(Set<BookOneToMany> books) {
        this.books = books;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<SubjectOneToMany> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<SubjectOneToMany> subjects) {
        this.subjects = subjects;
    }
}
