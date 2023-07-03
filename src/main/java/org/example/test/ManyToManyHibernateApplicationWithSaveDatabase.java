/**
 * Created By Krishna Shinde
 * Date : 03-07-2023
 * Time : 16:07
 * Project: ManyToManyHibernateApplicationWithSaveDatabase
 **/

package org.example.test;

import org.example.domain.Author;
import org.example.domain.Books;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ManyToManyHibernateApplicationWithSaveDatabase {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Author author=new Author();
        author.setAuthor_Name("Krishna Shinde");
        author.setAuthor_Email("krishnashinde8975@gmail.com");
        author.setAuthor_Education("MCA");

        Books books=new Books();
        books.setBook_Name("Let us Java");
        books.setBook_Edition("3.0");
        books.setBook_Publisher("Java publisher");

        author.getBooks().add(books);
        books.getAuthor().add(author);

        session.persist(author);

        Author author1=(Author) session.get(Author.class,1);
        Books books1=(Books) session.get(Books.class,1);

        System.out.println("<<<<<<<<<<<<<<<<<<<<Author Info>>>>>>>>>>>>>>>>>>");

        System.out.println("Author Name>>>>>"+author1.getAuthor_Name());
        System.out.println("Author Email>>>>>"+author1.getAuthor_Email());
        System.out.println("Author Education>>>>>"+author1.getAuthor_Education());

        System.out.println("<<<<<<<<<<<<<<<<<<<<Book Info>>>>>>>>>>>>>>>>>>");

        System.out.println("Book Name>>>>>"+books1.getBook_Name());
        System.out.println("Book Publisher>>>>>"+books1.getBook_Publisher());
        System.out.println("Book Edition >>>>>"+books1.getBook_Edition());

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");

        transaction.commit();
        session.close();
        System.out.println("Data has been successfully saved");
    }
}


