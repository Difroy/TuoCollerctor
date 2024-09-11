package com.generation.collector.model.importer;

import com.generation.collector.model.entities.Collector;

public interface CollectorImporter {

	Collector importCollector (String source) throws Exception;
	
}


/* 

CollectorImporter (INTERFACCIA)
public Collector importCollector(String source);

TxtCollectorImporter
Classe concreta che implementa CollectorImporter

ProductFactory
classe concreta con metodo statico
Product make(String row)

LoadCollector
main()*/






								