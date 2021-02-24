package com.netmind.business;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

//import java.util.Date;
public class StudentBl {

	public boolean add(Student student) {
		StudentDao studentDao = new StudentDao();
		// Aqui teneis que realizar el calculo de la edad

		return studentDao.add(student);
	}

	private int calcularAge(Date dateOfBirth) {
		Period edad = Period.between(dateOfBirth.toInstant()
				.atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());
		return edad.getYears();
	}
}
