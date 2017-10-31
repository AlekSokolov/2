package com.company;
public class Main {
	public static void main(String[] args) {
	Person Contacts = new Person();
	Contacts.name = "Andrey";
	Contacts.id = 2;
	Contacts.age = 42;
	Contacts.phone = "380977163299";
		System.out.println("Имя: " + Contacts.name);
		System.out.println("Порядковый номер: " + Contacts.id);
		System.out.println("Возраст:" + Contacts.age);
		System.out.println("Телефон:" + Contacts.phone);

		Person Contacts2 = new Person();
		Contacts2.name = "Alina";
		Contacts2.id =  3;
		Contacts2.age = 25 - Integer.parseInt(args[0]);
		Contacts2.phone = "380663213122";
		System.out.println("Имя:" + Contacts2.name);
		System.out.println("Порядковый номер:" + Contacts2.id);
		System.out.println("Возраст:" + Contacts2.age);
		System.out.println("Телефон:" + Contacts2.phone);
	}
}
