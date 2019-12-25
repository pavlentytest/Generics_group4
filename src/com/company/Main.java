package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	     ArrayList persons = new ArrayList();
	     persons.add(0);
	     persons.add(1);
	     persons.add("dfgsdfgsdfg");
	     persons.add(new Object());

	     int a = (int) persons.get(2);

		ArrayList<Integer> bbb = new ArrayList<Integer>();
		bbb.add(0);
		bbb.add(1);
	//	bbb.add("sdfsdfsdf");

		Account<Integer, Double> acc1 = new Account(1111,44484);
		Account<String,Integer> acc2 = new Account("BN3243",2342342);
		Account.bbb();

    }
}
