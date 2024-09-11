package com.generation.collector.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Collector {

	protected int id;
	protected String name, surname, location;
	public List<Product>listProducts = new ArrayList <Product>(); 
	
	
	
	
	
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

	public void setId(int id) {
		this.id = id;
	}



	public int getTotalValue(){													
		
		int totale = 0;
		for (Product p : listProducts) {
			totale += p.getValue();
		}
		return totale;
	}
	
	public String familySafe() {
	    for (Product p : listProducts) {
	        if (p instanceof Book) {
	            Book book = (Book) p;
	            if (book.isAdult()) {
	                return "Contenuti per adulti!";
	            }
	        }  
	    }
	    return "Contenuto FamilySafe!";
	}



	

}

/*
Collector
    
    

CollectorImporter (INTERFACCIA)
public Collector importCollector(String source);

TxtCollectorImporter
Classe concreta che implementa CollectorImporter

ProductFactory
classe concreta con metodo statico
Product make(String row)

LoadCollector
main()*/
