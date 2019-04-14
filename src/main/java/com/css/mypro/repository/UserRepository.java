package com.css.mypro.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.css.mypro.domain.User;
/**
 * 
 * 
 * @author guo
 *
 */
public interface UserRepository  extends JpaRepository<User, Long>{
  User findById(long id);
  @Query("select u from User u")
  public Page<User> findALL(Pageable  pageable);
  
}
