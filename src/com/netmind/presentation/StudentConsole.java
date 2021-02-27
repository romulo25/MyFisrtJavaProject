package com.netmind.presentation;

import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.model.EnumStudent;
import com.netmind.model.Student;

public class StudentConsole {

	@SuppressWarnings("static-access")
	public static void selectOperation() {
		Scanner scanner = new Scanner(System.in);
		StudentBl studentBl = new StudentBl();
		EnumStudent enumStudent = null;
		int option;

		do {
			showPrincipalMenu();
			// The nextInt() method does not deal with the EOL token,
			// while nextLine() does.
			option = Integer.parseInt(scanner.nextLine());
			enumStudent = EnumStudent.fromValue(option);

			switch (enumStudent) {
			case ADD_STUDENT:
				Student student = new Student();
				addNewStudent(student, scanner);
				studentBl.add(student);
				break;
			case EXIT:
				System.out.println("Good Bye!!");
				break;
			default:
				break;
			}
		} while (option != enumStudent.EXIT.value());
		scanner.close();
	}

	private static void showPrincipalMenu() {
		System.out.println("¿Qué opción quiere seleccionar?");
		System.out.println("1.Agregar un nuevo estudiante");
		System.out.println("2.Calcular el estudiante con mayor edad");
		System.out.println("3.Salir del programa");
	}

	private static void addNewStudent(Student student, Scanner scanner) {
		System.out.println("1.Agregar un nuevo estudiante");
		System.out.println("Introduce nombre: ");
		student.setName(scanner.nextLine());

		System.out.println("Introduce apellidos: ");
		student.setSurname(scanner.nextLine());

		System.out.println("Introduce Fecha de nacimiento: ");

	}
}
