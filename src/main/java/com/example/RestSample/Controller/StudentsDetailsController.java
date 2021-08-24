package com.example.RestSample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestSample.Pojo.StudentDetails;
import com.example.RestSample.Repository.StudentDetailsRepo;

@RestController
@RequestMapping("/api")
public class StudentsDetailsController {
	
	@Autowired
	private StudentDetailsRepo detailsRepo;
	
	@PostMapping("/details")
	public StudentDetails savedetails(@RequestBody StudentDetails studentDetails) {
		return detailsRepo.save(studentDetails);
		
	}
	
	@GetMapping("/getdetails/{id}")
	public StudentDetails getdetails(@PathVariable int id) {
		return detailsRepo.findById(id).get();
	
	}
	@PutMapping("/updatedetails")
	public void updatedetails(@RequestBody StudentDetails details) {
		detailsRepo.save(details);
	}
	
	@DeleteMapping("/deletedetails/{id}")
	public void deletestudent(@PathVariable int id) {
		detailsRepo.deleteById(id);
		
		
		
		
	}

}
