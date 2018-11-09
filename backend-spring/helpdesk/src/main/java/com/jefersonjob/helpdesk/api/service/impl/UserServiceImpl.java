package com.jefersonjob.helpdesk.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

import com.jefersonjob.helpdesk.api.entity.User;
import com.jefersonjob.helpdesk.api.repository.UserRepository;
import com.jefersonjob.helpdesk.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return this.userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return this.userRepository.findById(id).get();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);
	}

	@Override
	public Page<User> findAll(int page, int count) {
		// TODO Auto-generated method stub
		Pageable pages = new QPageRequest(page, count);
		return this.userRepository.findAll(pages);
	}

}
