package com.itstyle.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itstyle.jpa.model.User;
import com.itstyle.jpa.repository.UserRepository;

@SpringBootApplication
public class SpringbootJpaApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			User user = new User();
			user.setName("张三");
			user.setAge(20);
			userRepository.save(user);
			List<User> u = userRepository.findByNameLike("%张三%");
			System.out.println(u.size());
			User  us =  userRepository.findByAge(20);
			System.out.println(us.getAge());
			us =  userRepository.findByName("这是你干");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}