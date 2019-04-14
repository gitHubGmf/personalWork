package com.css.mypro.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.css.mypro.domain.User;
import com.css.mypro.repository.UserRepository;
/**
 * 
 * 
 * @author guo
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public Page<User> getUserList(Pageable page) {
		Page<User> pageReturn = userRepository.findALL(page);
		return pageReturn;
	}


	@Override
	public void save(User user) {
		userRepository.save(user);

	}
	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User findById(long id) {
		return userRepository.findById(id);
	}


	@Override
	public List<String> findAll() {
		Float man=0f;
		Float woman=0f;
		List<User> list = userRepository.findAll();
		if(list.size()>0) {
		for (User user : list) {
			if("男".equals(user.getSex())) man++;
			else {
				woman++;
			}
		}
		}
		List<String> result=new ArrayList();
		result.add(man/(man+woman)*100+"");
		result.add(woman/(man+woman)*100+"");
		return result;
	}
	public static void main(String[] args) {
		System.out.println(1.0/2.0*100);
	}

}
