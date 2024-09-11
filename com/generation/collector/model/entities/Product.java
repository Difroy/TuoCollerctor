package com.generation.collector.model.entities;

public abstract class Product {

	protected final int id;
	protected int value;
	protected String name, description;
	
	public Product(int id, int value, String name, String description) {
		
		this.id = id;
		this.value = value;
		this.name = name;
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}
	
	
	
	
	
	
	
	
}



/*
 * Product
    classe astratta
    id, name, value, description (getter e setter e costruttori)

Book 
    sottoclasse concreta di Product
    writer, language, pages, genre (genre è di tipo GENRE)

Genre
    ENUM con una proprietà "adult" di tipo boolean
    Es: HORROR(true)
    DRAMA(true)
    COMEDY(false)


Action figure
    sottoclasse concreta di Product
    height, weight, material

Comic
    sottoclasse concreta di Book
    artists (string), year, publisher

Collector
    id, name, surname, location, products (List Product)
    metodi
    getTotalValue() valore totale di tutta la sua collection
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
 