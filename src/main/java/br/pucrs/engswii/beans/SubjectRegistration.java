package br.pucrs.engswii.beans;

import java.util.ArrayList;
import java.util.List;

public class SubjectRegistration {

	private List<Subject> subjectRecords;

	private static SubjectRegistration sbjregd = null;

	private SubjectRegistration(){
		subjectRecords = new ArrayList<Subject>();
	}

	public static SubjectRegistration getInstance() {

		if(sbjregd == null) {
			sbjregd = new SubjectRegistration();
			return sbjregd;
		}
		else {
			return sbjregd;
		}
	}

	public void add(Subject subject) {
		for (Subject existingSubject : subjectRecords) {
			if (existingSubject.getCode().equals(subject.getCode())) {
				System.out.println("Error: A subject with the same code already exists.");
				throw new IllegalArgumentException("A subject with the same code already exists.");
			}
		}
		
		subjectRecords.add(subject);
		System.out.println("Subject added successfully.");
	}
	

	public List<Subject> getSubjectRecords() {
		return subjectRecords;
	}

}