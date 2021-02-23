package com.netmind.business;

import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

//import java.util.Date;
public class StudentBl {

	public boolean add(Student student) {
		StudentDao studentDao = new StudentDao();
		// Aqui teneis que realizar el calculo de la edad

		return studentDao.add(student);
	}
}
