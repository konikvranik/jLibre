package net.suteren.jlibre.model;

import java.io.InputStream;
import java.net.URL;

public class Book implements Cloneable {

	private int id;

	private String name;

	private BookMetainfo metaInfo;

	private Cover cover;

	private URL url;

	private BookFormat format;

	public BookMetainfo getMetaInformation() {
		return metaInfo;
	}

	public String getName() {
		return name;
	}

	public InputStream getBookData() {
		// TODO
		assert false : "Needs to be implemented!!";
		return null;
	}

	public Cover getCover() {
		return cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;
	}

	public URL getUrl() {
		return url;
	}

	public BookFormat getFormat() {
		return format;
	}

	public void setBookFormat(BookFormat format) {
		this.format = format;
	}

	public void rename(String name) {
		// TODO
		assert false : "Needs to be implemented!!";
	}

	public void move(URL url) {
		// TODO
		assert false : "Needs to be implemented!!";
	}

	public Book clone(BookFormat format) {
		// TODO
		assert false : "Needs to be implemented!!";
		return null;
	}

	public void setMetaInfo(BookMetainfo metaInfo) {
		this.metaInfo = metaInfo;
	}

	public BookMetainfo getMetaInfo() {
		return metaInfo;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public void setFormat(BookFormat format) {
		this.format = format;
	}

}
