package org.mahebert.maven.dao;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahebert.maven.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:BookDAOTest-context.xml")
public class BookDaoTest 
{
	 
	 @Autowired
	 private BookDAO bookDao;
	 
	 private static Book book;
	 
	 @BeforeClass
	 public static void initContact(){
		 book=new Book();
		 book.setName("22xxxx");
	 }
	 
	 @Test
	 public void testSaveContact() {
	  System.out.println("------------testSaveContact(): start -------");
	  bookDao.saveBook(book);
	  System.out.println("------------testSaveContact(): end -------");
	 }
	  
	 @Test
	 public void testgetContact() {
	  System.out.println("------------testSaveContact(): start -------");
	  Book book1 = bookDao.getBook(1);
	  assertEquals(book.getName(),"22xxxx");
	  System.out.println("------------testSaveContact(): end -------");
	 }
}
