/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calebjosue.bookstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author calebjosue
 */
@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 200)
    @NotNull
    @Size(min = 1, max = 200)
    private String title;
    
    @Column(length = 1000)
    @Size(min = 0, max = 1000)
    private String description;
    
    @Column(name = "unit_price")
    @Min(1)
    private Float unitPrice;
    
    @NotNull
    @Size(min = 1, max = 50)
    private String isbn;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "publication_date")
    @Past
    private Date publicationDate;
    
    @Column(name = "number_of_pages")
    private Integer numberOfPages;
    
    @Column(name = "image_url")
    private String imageUrl;
    
    private Language language;
    
    public Long getId() {
        
        return id;
    }

    public void setId(Long id) {
        
        this.id = id;
    }

    public String getTitle() {
        
        return title;
    }

    public void setTitle(String title) {
        
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        
        this.description = description;
    }

    public Float getUnitPrice() {
        
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        
        this.unitPrice = unitPrice;
    }

    public String getIsbn() {
        
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublicationDate() {
        
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        
        this.publicationDate = publicationDate;
    }

    public Integer getNumberOfPages() {
        
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        
        this.numberOfPages = numberOfPages;
    }

    public String getImageUrl() {
        
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        
        this.imageUrl = imageUrl;
    }

    public Language getLanguage() {
        
        return language;
    }

    public void setLanguage(Language language) {
        
        this.language = language;
    }
    
    @Override
    public int hashCode() {
        
        int hash = 0;
        hash += id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            
            return false;
        }
        
        Book other = (Book) object;
        
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", description=" 
                + description + ", unitPrice=" + unitPrice + ", isbn=" + isbn 
                + ", publicationDate=" + publicationDate + ", numberOfPages=" 
                + numberOfPages + ", url=" + imageUrl 
                + ", language=" + language + '}';
    }  
}