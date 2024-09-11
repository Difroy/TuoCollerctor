package com.generation.collector.controller;

import java.util.Scanner;

import com.generation.collector.model.entities.Collector;
import com.generation.collector.model.importer.CollectorImporter;
import com.generation.collector.model.importer.TxtCollectorImporter;


public class LoadCollector {

	public static void main(String[] args) {
		
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		CollectorImporter importer = new TxtCollectorImporter();
		
		do {
			
		 System.out.println("Inserire il nome del file da caricare");
		 String filename = keyboard.nextLine();
		 
		 try {
			 Collector loaded = importer.importCollector(filename);
			 System.out.println(loaded.getId() + " "+ loaded.getName()+" "+ loaded.getSurname() + " "+ loaded.getLocation());
			 System.out.println("Spesa totale: "+loaded.getTotalValue());
			 
		 }catch(Exception e) {
			 
			 System.out.println("Caricamento non riuscito");
			 e.printStackTrace();
			 
		 }
		 
		 System.out.println("Digitare S per ripetere");
		 if(!keyboard.nextLine().equals("S"))
			 break;
		 
		}while(true);
		
		System.out.println("Addio");
		
	}

}
