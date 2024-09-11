package com.generation.collector.model.entities;

public class Comic extends Book {

	protected String artist, publisher;
	protected int year;

	public Comic(int id, int value, String name, String description, String artist, String publisher, int year) {

		super(id, value, name, description);

		this.artist = artist;
		this.publisher = publisher;
		this.year = year;

	}
}


