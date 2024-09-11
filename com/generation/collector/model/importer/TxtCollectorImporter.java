package com.generation.collector.model.importer;
import java.io.File;
import java.util.Scanner;

import com.generation.collector.model.entities.ActionFigure;
import com.generation.collector.model.entities.Collector;
import com.generation.collector.model.entities.Comic;
import com.generation.collector.model.entities.Genre;
import com.generation.collector.model.entities.Product;

public class TxtCollectorImporter implements CollectorImporter {

	
	
	@Override
	public Collector importCollector(String source) throws Exception {
		
		Collector res = new Collector(); /*Come si fa se ho un costruttore? Soprattuto con FINAL ID?*/
		Scanner reader = new Scanner (new File(source));
		
		
		res.setId(Integer.parseInt(reader.nextLine()));
		res.setName(reader.nextLine());
		res.setSurname(reader.nextLine());
		res.setLocation(reader.nextLine());
		
		//1, Froy, Lamus, Caserta.
		
		while(reader.hasNextLine())
			res.listProducts.add(rowToBroduct(reader.nextLine()));
		reader.close();
			
		
		return res;
			
	}
	
	
	private Product rowToBroduct(String row) {
		
		String[] parts = row.split(",");
		
		Product res= null;
		
		switch(parts[0]) {
		
		case "COMIC":
			res = new Comic
			(
				Integer.parseInt(parts[1]),
				Integer.parseInt(parts[2]),
				parts[3],
				parts[4],
				parts[5],
				parts[6],
				Integer.parseInt(parts[7]),
				Genre.valueOf(parts[8]),
				parts[9],
				parts[10],
				Integer.parseInt(parts[11])
			);
			break;
			
		case "ACTION FIGURE":
			res = new ActionFigure
			(
				Integer.parseInt(parts[1]),
				Integer.parseInt(parts[2]),
				parts[3],
				parts[4],
				Integer.parseInt(parts[5]),
				Integer.parseInt(parts[6]),
				parts[7]
			);
			break;
			default:
				throw new RuntimeException("Bad product type "+parts[0]);
	}
		
		
		
		return null;
		
	}
	
	
	

}
