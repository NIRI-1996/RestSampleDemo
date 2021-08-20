package com.example.RestSample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestSample.Pojo.StudentDetails;

@Repository
public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Integer> {

}
