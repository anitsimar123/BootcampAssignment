package com.SpringJPAHibernateAssignment3.OneToOne.entities;

import javax.persistence.*;

@Entity
@Table(name = "book_one_to_one")
public class BookOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;

    private String bookName;

    @OneToOne(mappedBy = "bookOneToOne")
    private AuthorOneToOne authorOneToOne;

    public BookOneToOne() {
    }

    public BookOneToOne(Integer book_id, String bookName, AuthorOneToOne authorOneToOne) {
        this.book_id = book_id;
        this.bookName = bookName;
        this.authorOneToOne = authorOneToOne;
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

    public AuthorOneToOne getAuthorOneToOne() {
        return authorOneToOne;
    }

    public void setAuthorOneToOne(AuthorOneToOne authorOneToOne) {
        this.authorOneToOne = authorOneToOne;
    }
}
