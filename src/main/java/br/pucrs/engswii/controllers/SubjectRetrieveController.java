package br.pucrs.engswii.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.Subject;
import br.pucrs.engswii.beans.SubjectRegistration;

@RestController
public class SubjectRetrieveController {
	@GetMapping("/get/subjects")
	public List<Subject> getAllSubjects() {
		System.out.println("GET: /get/subjects");    
		return SubjectRegistration.getInstance().getSubjectRecords();
	}

}
