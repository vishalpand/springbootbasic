package com.spring.database.Repository;

import org.springframework.data.repository.CrudRepository;


import com.spring.database.model.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
	
}  