package com.generation.collector.model.entities;

public class Book extends Product{

	protected String writer, language;
	public int pages;
	Genre genre;
	
	public Book(int id, int value, String name, String description,String writer,String language, int pages,Genre genre) {
		super(id, value, name, description);
		
	}

	
}



/*Product
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