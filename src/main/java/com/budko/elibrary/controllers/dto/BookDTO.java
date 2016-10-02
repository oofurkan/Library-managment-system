package com.budko.elibrary.controllers.dto;

import com.budko.elibrary.entities.Author;
import com.budko.elibrary.entities.BookCard;
import com.budko.elibrary.entities.UDKCategory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Set;

/**
 * @author DBudko.
 */
@Component
public class BookDTO {
    private Integer bookId;
    private String bookName;
    private String publisher;
    private String description;
    private String publication;
    private Integer publishYear;
    private Integer pagesCount;
    private MultipartFile imageLink;
    private List<Author> authors;
    private UDKCategory udkCategory;
    private Set<BookCard> bookCards;

    public Integer getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public Integer getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(Integer pagesCount) {
        this.pagesCount = pagesCount;
    }

    public MultipartFile getImageLink() {
        return imageLink;
    }

    public void setImageLink(MultipartFile imageLink) {
        this.imageLink = imageLink;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public UDKCategory getUdkCategory() {
        return udkCategory;
    }

    public void setUdkCategory(UDKCategory udkCategory) {
        this.udkCategory = udkCategory;
    }

    public Set<BookCard> getBookCards() {
        return bookCards;
    }

    public void setBookCards(Set<BookCard> bookCards) {
        this.bookCards = bookCards;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", description='" + description + '\'' +
                ", publication='" + publication + '\'' +
                ", publishYear=" + publishYear +
                ", pagesCount=" + pagesCount +
                ", imageLink='" + imageLink + '\'' +
                ", authors=" + authors +
                ", udkCategory=" + udkCategory +
                ", bookCards=" + bookCards +
                '}';
    }
}
