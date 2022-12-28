
package com.multi.repository.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multi.model.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
