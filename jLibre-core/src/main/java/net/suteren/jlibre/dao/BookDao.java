package net.suteren.jlibre.dao;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

import net.suteren.jlibre.model.Book;
import net.suteren.jlibre.model.Rating;

public interface BookDao {

	Collection<Book> loadProductsByTitle(String category)
			throws DataAccessException;

	void saveBook(Book book) throws DataAccessException;

	Book load(Book book) throws DataAccessException;

	void saveRating(Rating rating) throws DataAccessException;

	Collection<Book> loadProductsByName(String string)
			throws DataAccessException;

}
