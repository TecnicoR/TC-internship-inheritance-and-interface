package com.tc.training.inheritance.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.tc.training.inheritance.behaviour.Printer;
import com.tc.training.inheritance.templates.Order;

public class FilePrinter implements Printer {

	@Override
	public void print(Order input) {
		try {
			BufferedWriter fout = new BufferedWriter(new FileWriter("Order_Details.txt", true));
			fout.write(input.toString() + "\n");
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
