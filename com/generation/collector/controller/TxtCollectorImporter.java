package com.generation.collector.controller;

import java.util.Scanner;

import com.generation.collector.model.entities.Collector;

public class TxtCollectorImporter implements CollectorImporter {

	
	
	@Override
	public Collector importCollector(String source) throws Exception {
		
		Collector res = new Collector();
		Scanner reader = new Scanner (new File(source));
		
		res.getId(Integer.parseInt(reader.hasNextLine()));
		
		return res;
	}

}
