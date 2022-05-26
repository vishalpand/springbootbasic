package com.spring.database.service;

import java.util.ArrayList;

import java.util.List;
//import java.util.Set;

//import javax.management.loading.PrivateClassLoader;

//import org.hibernate.metamodel.model.domain.IdentifiableDomainType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.database.Repository.BooksRepository;
import com.spring.database.model.Books;

//import net.bytebuddy.implementation.bind.ArgumentTypeResolver.ParameterIndexToken;

//defining the business logic  
@Service
public class BooksService{
	@Autowired
	BooksRepository booksRepository;
	
	

//getting all books record by using the method findaAll() of CrudRepository  
	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<Books>();
		
	   int multiplier = 10;
	

		booksRepository.findAll().forEach(books1 -> books.add(books1));
		for(int i = 0; i < books.size(); i++ ) {
			books.get(i).setPrice(books.get(i).getPrice() * multiplier);
		}
		
		for(int i=0; i < books.size(); i++) {
			
			books.get(i).setAuthor(books.get(i).getAuthor() +" pandey");
		}
		
		return books;
	}



//getting a specific record by using the method findById() of CrudRepository  
	public Books getBooksById(int id) {
		return booksRepository.findById(id).get();
	}

//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Books books) {
		booksRepository.save(books);
	}

//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id) {
		booksRepository.deleteById(id);
	}

//updating a record  
	public void update(Books books, int bookid) {
		booksRepository.save(books);
	}

	public void saveOrUpdateAll(List<Books> books) {

		booksRepository.saveAll(books);
		// return books;
	}



}