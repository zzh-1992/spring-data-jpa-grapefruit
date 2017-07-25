package com.itstyle.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.itstyle.jpa.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);
	
	User findByAge(Integer age);

	User findByNameAndAge(String name, Integer age);
	
	List<User> findByNameLike(String name);

	@Query("from User u where u.name=:name")
	User findUser(@Param("name") String name);
	
}
