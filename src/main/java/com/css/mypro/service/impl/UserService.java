package com.css.mypro.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.css.mypro.domain.User;
/**
 * 
 * 
 * @author guo
 *
 */
public interface UserService {
	/**
	 * 分页查询用户列表
	 * @param page
	 * @return 
	 * 
	 */
	public Page<User> getUserList(Pageable page);
	
	/**
	 * 分页查询用户列表
	 * @return 所有用户的集合 
	 */

	public List<String> findAll();
	/**
	 * 保存用户
	 * @param user
	 */

	public void save(User user);
     /**
      * 删除当前id的用户
      * @param id
      */
	public void delete(Long id);

	/**
	 * 查询当前id的用户
	 * @param id
	 * @return user
	 */
	public User findById(long id);

}
