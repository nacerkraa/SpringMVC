package com.example.demo.controller;

import java.util.List;

import org.aspectj.weaver.ast.Instanceof;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;
	

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	private String listStudents(Model model) {
		//Student st = new Student(4, "Nacer", "kraa", "nacer@exemple.com");
		//Student st2 = new Student(4, "Nacer", "kraa", "nacer@exemple.com");
		List<Student> ls =  studentService.getAllStudents();
		//ls.add(st);
		//ls.add(st2);
		//ls.add(st);
		model.addAttribute("students", ls);
		
		return "students";
	}
	
	@GetMapping("/page")
	private String index(Model model) {
		
		
		return "home";
	}
}
