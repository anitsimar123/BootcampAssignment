package com.SpringJPAHibernateAssignment3.OneToMany.entities;

import javax.persistence.*;

@Entity
@Table(name = "subject_one_to_many")
public class SubjectOneToMany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorOneToMany authorOneToMany;

    public SubjectOneToMany() {
    }

    public SubjectOneToMany(Integer id, String name, AuthorOneToMany authorOneToMany) {
        this.id = id;
        this.name = name;
        this.authorOneToMany = authorOneToMany;
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

    public AuthorOneToMany getAuthorOneToMany() {
        return authorOneToMany;
    }

    public void setAuthorOneToMany(AuthorOneToMany authorOneToMany) {
        this.authorOneToMany = authorOneToMany;
    }

}
