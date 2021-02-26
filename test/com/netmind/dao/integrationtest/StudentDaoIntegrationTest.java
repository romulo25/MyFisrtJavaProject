package com.netmind.dao.integrationtest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.UUID;

import org.junit.Test;

import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class StudentDaoIntegrationTest {

	@Test
	public void testAddStudentToFile() {
		Student student = new Student();
		StudentDao studentDao = new StudentDao();

		Student findedStudent = findStudent(student.getUUID());
		assertEquals(student, findedStudent);
		fail("Not yet implemented");

	}

	private Student findStudent(UUID uuid) throws Exception {
		throw new Exception("the method is not yet implemented");

	}

}
