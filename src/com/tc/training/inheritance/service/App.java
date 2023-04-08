package com.tc.training.inheritance.service;

import java.time.LocalDate;

import com.tc.training.inheritance.behaviour.Printer;


public class App {

	public static void main(String[] args) {
		B2BOrder order1B2B = new B2BOrder();
		B2COrder order2B2C = new B2COrder();
		Printer fPrinter = new FilePrinter();
		Printer cPrinter = new ConsolePrinter();
		
		
		//Inputs are given statically for testing purpose
		
		order1B2B.setId(1);
		order1B2B.setCompanyName("ThoughtClan");
		order1B2B.setAmount(5000000);
		order1B2B.setDate(LocalDate.of(2022, 04, 04));
		
		order2B2C.setId(2);
		order2B2C.setCustomerName("Rabinarayan Patra");
		order2B2C.setAmount(250000);
		order2B2C.setDate(LocalDate.of(2022, 04, 04));
		
		
		fPrinter.print(order1B2B);
		fPrinter.print(order2B2C);
		
		cPrinter.print(order1B2B);
		cPrinter.print(order2B2C);
		
	}

}
