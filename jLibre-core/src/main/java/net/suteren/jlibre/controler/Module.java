package net.suteren.jlibre.controler;

public interface Module {

	String getName();

	String getDescription();

	Integer getVersion();

	String getVersionString();

	void init();

	void destroy();
}
