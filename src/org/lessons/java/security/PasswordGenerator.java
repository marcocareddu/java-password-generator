package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
//	Take vars from user
	System.out.println("Digita il tuo nome");
	String name = in.nextLine();
	System.out.println("Digita il tuo cognome");
	String lastname = in.nextLine();
	System.out.println("Digita il tuo colore preferito");
	String color = in.nextLine();
	System.out.println("Digita il tuo giorno di nascita");
	String day = in.nextLine();
	int intDay = Integer.valueOf(day);
	System.out.println("Digita il tuo mese di nascita");
	String month = in.nextLine();
	int intMonth = Integer.valueOf(month);
	System.out.println("Digita il tuo anno di nascita");
	String year = in.nextLine();
	int intYear = Integer.valueOf(year);
	
//	Date sum
	int dateSum = intDay+intMonth+intYear;
	
//	Print pass concat
	System.out.print("La tua password é: ");
	System.out.println(name + "-" + lastname + "-" + color + "-" + dateSum);
}
}
