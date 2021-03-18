package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/students")
public class StudentController {

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newStudent() {
		return "student/new";
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String saveStudent() {
		return "student/list";
	}

	@RequestMapping(value = "/new", params = "btnDelete" ,method = RequestMethod.POST)
	public String deleteStudent() {
		return "student/delete";
	}

	@RequestMapping(value = "/new", params = "btnPut",method = RequestMethod.POST)
	public String listStudent() {
		return "student/put";
	}
	
	/* giá trị của params trùng giá trị name của button bên phần view 
	để nó tìm sang controller cùng tên với params naog thì thực hiện action đó
    
    */
}
