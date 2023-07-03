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
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String book_Name;
    private String book_Publisher;
    private String book_Edition;
    @ManyToMany(mappedBy = "books",cascade = CascadeType.ALL)
    Set<Author> author=new HashSet<Author>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_Name() {
        return book_Name;
    }

    public void setBook_Name(String book_Name) {
        this.book_Name = book_Name;
    }

    public String getBook_Publisher() {
        return book_Publisher;
    }

    public void setBook_Publisher(String book_Publisher) {
        this.book_Publisher = book_Publisher;
    }

    public String getBook_Edition() {
        return book_Edition;
    }

    public void setBook_Edition(String book_Edition) {
        this.book_Edition = book_Edition;
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }
}


