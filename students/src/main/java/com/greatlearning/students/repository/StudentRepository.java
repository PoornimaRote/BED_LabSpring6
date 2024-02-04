package com.greatlearning.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.students.model.Student;
import com.greatlearning.students.model.User;

public interface StudentRepository extends JpaRepository<User, Integer> {

	@Query("select u from User u where u.username = ?1")
	User findByUsername(String username);

}
