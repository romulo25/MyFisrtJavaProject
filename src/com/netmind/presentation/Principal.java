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

		System.out.println("�qu� opcione uieres selecionr?");

		studentBl.add(student);
	}
}