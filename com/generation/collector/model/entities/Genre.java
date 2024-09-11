package com.generation.collector.model.entities;

public enum Genre {

	HORROR (true),
	DRAMA (true),
	COMEDY (false);
	
	protected boolean adult;
	
	Genre (boolean adult){
	this.adult = adult;
	}

}





