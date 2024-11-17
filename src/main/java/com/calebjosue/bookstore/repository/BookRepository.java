/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calebjosue.bookstore.repository;

import com.calebjosue.bookstore.model.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;

import java.util.List;

/**
 *
 * @author calebjosue
 */
@Transactional(Transactional.TxType.SUPPORTS)
public class BookRepository {
    
    @PersistenceContext(unitName = "bookStorePU")
    private EntityManager em;
    
    public Book find(@NotNull Long id) {
        
        return em.find(Book.class, id);
    }
    
    @Transactional(Transactional.TxType.REQUIRED)
    public Book create(@NotNull Book book) {
        
        em.persist(book);
        return book;
    }
    
    @Transactional(Transactional.TxType.REQUIRED)
    public void delete(@NotNull Long id) {
        
        em.remove(em.find(Book.class, id));
    }
    
    public List<Book> findAll() {
        
        TypedQuery<Book> query = em.createQuery("SELECT b FROM book AS b ORDER BY b.",
                Book.class);
        return query.getResultList();
    }
    
    public Long countBooks() {
        
        TypedQuery<Long> query = em.createNamedQuery("SELECT COUNT(b) FROM b AS b", Long.class);
        return query.getSingleResult();
    }   
}