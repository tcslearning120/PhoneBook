package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Transactional

	public void saveUser(@Valid User user) {
		userRepository.save(user);

	}

	public Optional<User> getuser(Integer id) {

		return userRepository.findById(id);
	}
@Transactional
	public void deleteUser(Integer id) {

		userRepository.deleteById(id);
	}

}
