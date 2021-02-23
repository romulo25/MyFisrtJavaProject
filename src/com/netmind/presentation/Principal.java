package com.netmind.presentation;

import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.model.Student;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("this is my first java project");

		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		StudentBl studentBl = new StudentBl();

		System.out.println("¿qué opcione uieres selecionr?");
		System.out.println("1.Agregar un nuevo estudiante");
		System.out.println("2.Calcular el estudiante con mayor edad");

		int option = Integer.parseInt(scanner.nextLine());

		switch (option) {
		case 1:
			System.out.println("1.Agrega un nuevo Estudiante");
			System.out.println("Introduce el nombre: ");
			student.setName(scanner.nextLine());
			System.out.println("Hola " + student.getName() + "!");
			System.out.println("Introduce el apellido: ");
			student.setSurname(scanner.nextLine());
			System.out.println(
					"Hola " + student.getName() + " " + student.getSurname());
			break;
		}
		scanner.close();
		studentBl.add(student);
	}
}