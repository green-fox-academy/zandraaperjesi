package com.zandraa.perjesi.repository;

import com.zandraa.perjesi.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
