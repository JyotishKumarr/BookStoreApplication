package com.bookStore.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookStore.bookStore.service.MyBookService;

@Controller
public class MyBookController {

	@Autowired
	private MyBookService mybook;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		mybook.deleteMyBook(id);
		return "redirect:/my_books";
	}
	
}
