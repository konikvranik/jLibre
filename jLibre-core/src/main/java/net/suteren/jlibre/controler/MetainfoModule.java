package net.suteren.jlibre.controler;

import net.suteren.jlibre.model.Book;
import net.suteren.jlibre.model.BookMetainfo;

public interface MetainfoModule extends Module {

	void updateMetainfo(Iterable<Book> books);

	BookMetainfo getMetainfo(Book book);

}
