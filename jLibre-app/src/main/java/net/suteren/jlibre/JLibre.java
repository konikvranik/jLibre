package net.suteren.jlibre;

import java.util.List;

import net.suteren.jlibre.model.BookStorage;
import net.suteren.jlibre.model.Book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JLibre {


		public static void main(String[] args) {
		  ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		  BookStorage knihovna = (BookStorage) ctx.getBean("knihovna");

		  List<Book> knihy = knihovna.getBooks();
		  // TODO
		  System.out.println(knihy);
		}
}
