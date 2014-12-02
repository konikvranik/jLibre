package net.suteren.jlibre.dao;

import java.util.Collection;

import net.suteren.jlibre.model.Book;
import net.suteren.jlibre.model.Rating;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao {

	@Override
	public Collection<Book> loadProductsByTitle(String title)
			throws DataAccessException {
		return this
				.getHibernateTemplate()
				.find(
						"from net.suteren.jlibre.model.Book book where book.metaInfo.title=?",
						title);
	}

	@Override
	public void saveBook(Book book) throws DataAccessException {
		// this.getHibernateTemplate().persist(book);
		// this.getHibernateTemplate().save(book);
		this.getHibernateTemplate().saveOrUpdate(book);
	}

	@Override
	public Book load(Book book) {
		return (Book) getHibernateTemplate().load(Book.class, book.getId());
	}

	@Override
	public void saveRating(Rating rating) {
		this.getHibernateTemplate().saveOrUpdate(rating);

	}

	@Override
	public Collection<Book> loadProductsByName(String name)
			throws DataAccessException {
		return this
				.getHibernateTemplate()
				.find(
						"from net.suteren.jlibre.model.Book book where book.name like ?",
						"%" + name + "%");
	}

}