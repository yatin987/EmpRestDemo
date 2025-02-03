package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.model.Emp;
 
@RestController
@RequestMapping("/api/emps")
public class EmpController {
 
	@GetMapping
	public List<Emp> getEmps()
	{
		ArrayList<Emp> emps = new ArrayList<>();
		emps.add(new Emp(1,"Satish"));
		emps.add(new Emp(2,"Rahul"));
		emps.add(new Emp(3,"Vikas"));
		emps.add(new Emp(4,"Yatin"));
		return emps;
		
	}
}
 