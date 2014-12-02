package net.suteren.jlibre.controler;

import net.suteren.jlibre.controler.Module;
import net.suteren.jlibre.model.Book;
import net.suteren.jlibre.model.Cover;

public interface CoverModule extends Module {

	void updateCovers(Iterable<Book> books);

	Cover getCover(Book book);
	
}
