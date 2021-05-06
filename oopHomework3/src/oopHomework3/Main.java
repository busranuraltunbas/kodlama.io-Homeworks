package oopHomework3;

import oopHomework3.abstracts.BaseCustomerManager;
import oopHomework3.adapters.MernisServiceAdapter;
import oopHomework3.concrete.SturbucksCustomerManager;
import oopHomework3.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new SturbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Büþra Nur", "Korkut", 1995, "23456456554"));

	}

}
