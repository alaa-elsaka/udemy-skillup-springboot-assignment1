package com.cognizant.udemy.skillup.assignment;

import com.cognizant.udemy.skillup.assignment.services.IAdderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AssignmentApplicationTests {

	@Autowired
	IAdderService adderService;

	@Test
	void testAdding2Numbers() {
		int actual = adderService.add(2,3);
		assertEquals(actual,5);
	}

}
