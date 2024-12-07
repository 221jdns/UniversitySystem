package main;

import users.UserDatabase;
import users.User;
import users.Manager;
import users.Student;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		
		Scanner login = new Scanner(System.in);
		Scanner password = new Scanner(System.in);
		System.out.println("Welcome to the University System");
		
		System.out.println("Введите логин: ");
		String userlogin = login.nextLine();
		
		System.out.println("Введите пароль: ");
		String userpassword = password.nextLine();
		manager.authenticate(userlogin, userpassword);
		
		
		
		

	}

}
