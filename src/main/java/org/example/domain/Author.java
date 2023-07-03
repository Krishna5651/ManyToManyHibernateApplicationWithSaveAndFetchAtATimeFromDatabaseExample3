/**
 * Created By Krishna Shinde
 * Date : 03-07-2023
 * Time : 16:06
 * Project: ManyToManyHibernateApplicationWithSaveDatabase
 **/

package org.example.domain;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int author_Id;

    private String author_Name;
    private String author_Email;
    private String author_Education;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_books",joinColumns = {@JoinColumn(name = "author_Id")},
    inverseJoinColumns = {@JoinColumn(name = "id")})
    Set<Books> books=new HashSet<Books>();

    public int getAuthor_Id() {
        return author_Id;
    }

    public void setAuthor_Id(int author_Id) {
        this.author_Id = author_Id;
    }

    public String getAuthor_Name() {
        return author_Name;
    }

    public void setAuthor_Name(String author_Name) {
        this.author_Name = author_Name;
    }

    public String getAuthor_Email() {
        return author_Email;
    }

    public void setAuthor_Email(String author_Email) {
        this.author_Email = author_Email;
    }

    public String getAuthor_Education() {
        return author_Education;
    }

    public void setAuthor_Education(String author_Education) {
        this.author_Education = author_Education;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }
}


