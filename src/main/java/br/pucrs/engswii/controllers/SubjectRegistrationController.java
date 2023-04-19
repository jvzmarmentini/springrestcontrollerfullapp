package br.pucrs.engswii.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.*;

@RestController
public class SubjectRegistrationController {
	@PostMapping("/register/subject")
	public String registerSubject(@RequestBody Subject subject) {
		System.out.println("POST: /register/subject");     
		try {
			SubjectRegistration.getInstance().add(subject);
			return "Success!";
		} catch (IllegalArgumentException e) {
			return e.getMessage();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
