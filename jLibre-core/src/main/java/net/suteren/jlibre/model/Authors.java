package net.suteren.jlibre.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Authors extends LinkedHashSet<Author> {

	private static final long serialVersionUID = -616105053379521571L;
	
	private int id;
	
	public void setAuthors(Set<Author> authors) {
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	
}
