package net.suteren.jlibre.model;

import java.awt.image.BufferedImage;
import java.net.URL;

public class Cover {

	private int id;
	private URL url;

	public BufferedImage getImage() {
		// TODO
		assert false : "Needs to be implemented!";
		return null;
	}

	public URL getUrl() {
		return url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUrl(URL url) {
		this.url = url;
	}
}
