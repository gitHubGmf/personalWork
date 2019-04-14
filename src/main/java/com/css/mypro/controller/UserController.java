package com.css.mypro.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.css.mypro.domain.User;
import com.css.mypro.service.impl.UserService;
/***
 * 
 * @author 郭梦菲
 *
 */
@Controller
public class UserController {
	@Resource
	UserService userService;
    
	@RequestMapping("/")
	public String index() {
		return "redirect:/echars";
	}

	@RequestMapping("/echars")
	public String showEchars(Model model) {
		List<String> sexValue = userService.findAll();
		model.addAttribute("sexValue", sexValue);
		return "index";
	}

	@RequestMapping("/listUser")
	public String dirUserList(Model model,Long curentPage) {
		if(curentPage==null) {
			curentPage=(long)1;
			}
		Pageable page=new PageRequest((int) (curentPage-1), 5, new Sort(Direction.DESC,"id"));
		Page<User> users = userService.getUserList(page);
		model.addAttribute("users", users);
		return "users";
	}

	@RequestMapping("/delete")
	public String deleteById(Model model, Long id) {
		userService.delete(id);
		return "redirect:/listUser";
	}

	@RequestMapping("/justToAdd")
	public String justToAdd() {
		return "user";
	}

	@RequestMapping("/add")
	public String add(User user) {
		userService.save(user);
		return "redirect:/listUser";
	}
	@RequestMapping("/justToEdit")
	public String justToEdit(Model model, long id) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "user";
	}

}
