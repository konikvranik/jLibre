package net.suteren.jlibre.dao;

import java.util.List;

import net.suteren.jlibre.model.Book;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class BookServiceImpl implements BookService {
	private TransactionTemplate transactionTemplate;
	private BookDao bookDao;

	public void setTransactionManager(
			PlatformTransactionManager transactionManager) {
		this.transactionTemplate = new TransactionTemplate(transactionManager);
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void increasePriceOfAllProductsInCategory(final String name) {
		this.transactionTemplate
				.execute(new TransactionCallbackWithoutResult() {

					public void doInTransactionWithoutResult(
							TransactionStatus status) {
						List<Book> productsToChange = (List<Book>) bookDao
								.loadProductsByName(name);
						// do the price increase...
					}
				});
	}
}
