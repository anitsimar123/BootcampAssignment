package com.SpringJPAHibernateAssignment3.ManyToMany.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book_many_to_many")
public class BookManyToMany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;

    private String bookName;

    @ManyToMany(mappedBy = "books")
    private List<AuthorManyToMany> authorManyToManyList;

    public BookManyToMany() {
    }

    public BookManyToMany(Integer book_id, String bookName, List<AuthorManyToMany> authorManyToManyList) {
        this.book_id = book_id;
        this.bookName = bookName;
        this.authorManyToManyList = authorManyToManyList;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<AuthorManyToMany> getAuthorManyToManyList() {
        return authorManyToManyList;
    }

    public void setAuthorManyToManyList(List<AuthorManyToMany> authorManyToManyList) {
        this.authorManyToManyList = authorManyToManyList;
    }
}
