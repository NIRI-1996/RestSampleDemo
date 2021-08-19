package com.example.RestSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentsDetailsController {
	
	@Autowired
	private StudentDetailsRepo detailsRepo;
	
	@PutMapping("/details")
	public StudentDetails details(@RequestBody StudentDetails studentDetails) {
		return detailsRepo.save(studentDetails);
		
	}
	
	@PostMapping("/updatedetails/{id}")
	public StudentDetails updatedetails(@PathVariable int id) {
		StudentDetails sd=detailsRepo.findById(id).get();
    return detailsRepo.save(sd);
		
	}
	@GetMapping("/getdetails/{id}")
	public StudentDetails getdetails(@PathVariable int id) {
		return detailsRepo.findById(id).get();
		
	}
}
