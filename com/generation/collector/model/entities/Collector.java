package com.generation.collector.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Collector {

	protected final int id;
	protected String name, surname, location;
	public List<Product>listProducts = new ArrayList <Product>(); 
	Book book;
	
	public Collector(int id, String name, String surname, String location){
	
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.location = location;		
}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public List<Product> getListProducts() {
		return listProducts;
	}



	public void setListProducts(List<Product> listProducts) {
		this.listProducts = listProducts;
	}



	public int getId() {
		return id;
	}



	public int getTotalValue(){													
		
		int totale = 0;
		for (Product p : listProducts) {
			totale += p.getValue();
		}
		return totale;
	}
	
	/*public boolean familySafe(Book book) {
		
		if (book = true) {
			
		}
		
		return false;
	}*/
	
	
	
}

/*
Collector
    
    
    
    familySafe():boolean, un collector è FamilySafe se non ha nessun prodotto adult.
    (da fare per ultimo)

CollectorImporter (INTERFACCIA)
public Collector importCollector(String source);

TxtCollectorImporter
Classe concreta che implementa CollectorImporter

ProductFactory
classe concreta con metodo statico
Product make(String row)

LoadCollector
main()*/
