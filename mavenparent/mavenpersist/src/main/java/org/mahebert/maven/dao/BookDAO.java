package org.mahebert.maven.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.mahebert.maven.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {

	 @PersistenceContext
	 private EntityManager entityManager;
	 
    public BookDAO() {}

    public void saveBook(Book book) {
     entityManager.persist(book);
    }
    
    public Book getBook(Integer id) {
        return entityManager.find(Book.class, id);
   }

}