package com.SpringJPAHibernateAssignment3.OneToMany.entities;

import javax.persistence.*;

@Entity
@Table(name = "book_one_to_many")
public class BookOneToMany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String bookName;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorOneToMany authorOneToMany;

    public BookOneToMany() {
    }

    public BookOneToMany(Integer id, String bookName, AuthorOneToMany authorOneToMany) {
        this.id = id;
        this.bookName = bookName;
        this.authorOneToMany = authorOneToMany;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public AuthorOneToMany getAuthor() {
        return authorOneToMany;
    }

    public void setAuthor(AuthorOneToMany author) {
        this.authorOneToMany = author;
    }
}
