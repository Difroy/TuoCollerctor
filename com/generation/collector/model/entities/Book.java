package com.generation.collector.model.entities;

public class Book extends Product{

	protected String writer, language;
	public int pages;
	Genre genre;
    private boolean explicitContent;

    public boolean isAdult() {
        return explicitContent;
    }
	
	public Book(int id, int value, String name, String description,String writer,String language, int pages,Genre genre) {
		super(id, value, name, description);
		
	}

	
}



/* familySafe():boolean, un collector è FamilySafe se non ha nessun prodotto adult.
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