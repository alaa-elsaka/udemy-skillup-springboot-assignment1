package com.cognizant.udemy.skillup.assignment;

import com.cognizant.udemy.skillup.assignment.entities.Student;
import com.cognizant.udemy.skillup.assignment.services.IAdderService;
import com.cognizant.udemy.skillup.assignment.services.IStudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class AssignmentApplicationTests {

	@Autowired
	IAdderService adderService;

	@Autowired
	IStudentService studentService;

	@Test
	void testAdding2Numbers() {
		int expected = 2 + 3;
		int actual = adderService.add(2,3);
		assertEquals(actual,expected);
	}

	@Test
	void whenAddingNewStudent(){
		Student student = new Student();
		student.setName("Alaa");
		student.setTestScore(100);

		Student actual = studentService.save(student);

		assertEquals(actual, student);
	}

	@Test
	void whenupdateStudent(){
		Student student = new Student();
		student.setName("Alaa");
		student.setTestScore(100);

		Student actual = studentService.save(student);

		assertEquals(actual, student);
		student.setName("Alaa Elsaka");

		actual = studentService.save(student);
		assertEquals(actual, student);
		assertTrue(actual.getName().equals("Alaa Elsaka"));

	}

}
