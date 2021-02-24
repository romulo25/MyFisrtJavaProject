package com.netmind.presentation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.model.Student;

public class StudentConsole {

	public static void selectOperation() {
		Scanner scanner = new Scanner(System.in);
		StudentBl studentBl = new StudentBl();

		int option;

		do {
			showPrincipalMenu();
			option = Integer.parseInt(scanner.nextLine());

			switch (option) {
			case 1:
				Student student = new Student();
				addNewStudent(student, scanner);
				studentBl.add(student);
				break;
			}
		} while (option != 3);
		scanner.close();
	}

	private static void showPrincipalMenu() {
		System.out.println("¿Que opción quiere seleccionar?");
		System.out.println("1.Agregar un nuevo estudiante");
		System.out.println("2.Calcular el estudiante con mayor edad");
		System.out.println("3.Salir del programa");
	}

	private static void addNewStudent(Student student, Scanner scanner) {
		System.out.println("1.Agrega un nuevo estudiante");
		System.out.println("Introduce nombre");
		student.setName(scanner.nextLine());

		System.out.println("Introduce Apellido");
		student.setSurname(scanner.nextLine());

		System.out.println("Introduce Fecha de nacimiento");
		try {
			student.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy")
					.parse(scanner.nextLine()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
