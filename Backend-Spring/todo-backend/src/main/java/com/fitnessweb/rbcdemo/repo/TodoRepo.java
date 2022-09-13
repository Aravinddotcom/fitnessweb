package com.fitnessweb.rbcdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitnessweb.rbcdemo.model.Todo;

public interface TodoRepo extends JpaRepository<Todo, Long> {


}
