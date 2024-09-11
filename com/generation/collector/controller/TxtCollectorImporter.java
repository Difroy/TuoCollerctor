package com.generation.collector.controller;
import java.io.File;
import java.util.Scanner;

import com.generation.collector.model.entities.Collector;

public class TxtCollectorImporter implements CollectorImporter {

	
	
	@Override
	public Collector importCollector(String source) throws Exception {
		
		Collector res = new Collector(); /*Come si fa se ho un costruttore? Soprattuto con FINAL ID?*/
		Scanner reader = new Scanner (new File(source));
		
		
		res.setId();
		
		return res;
	}

}
