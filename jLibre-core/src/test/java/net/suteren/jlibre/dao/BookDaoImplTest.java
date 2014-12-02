package net.suteren.jlibre.dao;

import java.util.Collection;

import junit.framework.TestCase;
import net.suteren.jlibre.model.Book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.unitils.UnitilsJUnit3;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.orm.hibernate.HibernateUnitils;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;

@SpringApplicationContext( { "classpath:application.xml",
		"classpath:test-ds-config.xml" })
public class BookDaoImplTest extends UnitilsJUnit3 {

	private static Logger log = LoggerFactory.getLogger(BookDaoImplTest.class);

	@SpringBeanByType
	BookDao bookDao;

	public BookDaoImplTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
	}

	protected void tearDown() throws Exception {
	}

	public void testMappingToDatabase() {
	        HibernateUnitils.assertMappingWithDatabaseConsistent();
	    }

	@DataSet
	public void testLoadProductsByCategory() {

		log.info("start");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"application.xml");
		log.debug("Created app context");
		BookDao bookDao = (BookDao) ctx.getBean("bookDao");
		log.debug("Created BookDao");
		try {

			for (int i = 0; i < 20; i++) {
				Book book = new Book();
				log.debug("Got book " + i);

				book.setName("pokus" + i);
				bookDao.saveBook(book);
				log.debug("Saved book " + i);
			}
			// Collection<Book> knihy = bookDao.loadProductsByTitle("pokus");
			Collection<Book> knihy = bookDao.loadProductsByName("pokus");
			log.debug("Selected books");

			if (knihy.isEmpty()) {
				log.warn("No books with name pokus found.");
			} else {
				for (Book b : knihy) {
					log.info("Book " + b.getName());
				}
			}
			// TODO
			// System.out.println(knihy);
		} finally {
			;
		}

	}
}
