package com.greatlearning.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.students.model.Student;
import com.greatlearning.students.model.User;

public interface UserRepository extends JpaRepository<Student, Integer> {

	// User findByUsername(String username);
}
