package com.src.example;
import java.time.LocalDate;
public class HelloWorld {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Hi World!");
		System.out.println(date);
	}
}