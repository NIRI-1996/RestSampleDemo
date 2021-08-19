package com.example.RestSample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Integer> {

}
