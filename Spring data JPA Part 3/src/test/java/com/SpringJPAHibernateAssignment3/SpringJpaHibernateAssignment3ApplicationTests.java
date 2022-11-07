package com.SpringJPAHibernateAssignment3;


import com.SpringJPAHibernateAssignment3.ManyToMany.repos.AuthorManyToManyRepository;
import com.SpringJPAHibernateAssignment3.ManyToMany.repos.BookManyToManyRepository;
import com.SpringJPAHibernateAssignment3.OneToOne.entities.AuthorOneToOne;
import com.SpringJPAHibernateAssignment3.OneToOne.entities.BookOneToOne;
import com.SpringJPAHibernateAssignment3.OneToOne.repos.AuthorOneToOneRepository;
import com.SpringJPAHibernateAssignment3.ManyToMany.entities.AuthorManyToMany;
import com.SpringJPAHibernateAssignment3.ManyToMany.entities.BookManyToMany;
import com.SpringJPAHibernateAssignment3.OneToMany.entities.AuthorOneToMany;
import com.SpringJPAHibernateAssignment3.OneToMany.entities.BookOneToMany;
import com.SpringJPAHibernateAssignment3.OneToMany.entities.SubjectOneToMany;
import com.SpringJPAHibernateAssignment3.OneToMany.repos.AuthorOneToManyRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootTest
class SpringJpaHibernateAssignment3ApplicationTests {

	@Autowired
	AuthorOneToManyRepository authorOneToManyRepository;

	@Autowired
    AuthorManyToManyRepository authorManyToManyRepository;

	@Autowired
    BookManyToManyRepository bookManyToManyRepository;

	@Autowired
    AuthorOneToOneRepository authorOneToOneRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createAuthorOneToManyTest() {

		Address address = new Address();
		address.setLocation("New Delhi");
		address.setState("Delhi");
		address.setStreetNumber("90");


		AuthorOneToMany author = new AuthorOneToMany();


		author.setName("sahil");
		author.setAddress(address);

		HashSet<BookOneToMany> bookset = new HashSet<>();

		BookOneToMany b1 = new BookOneToMany();
		b1.setBookName("ABC");
		b1.setAuthor(author);

		BookOneToMany b2 = new BookOneToMany();
		b2.setBookName("DEF");
		b2.setAuthor(author);

		bookset.add(b1);
		bookset.add(b2);

		author.setBooks(bookset);

		HashSet<SubjectOneToMany> subjectSet = new HashSet<>();

		SubjectOneToMany subject1 = new SubjectOneToMany();
		subject1.setName("Philosophy");
		subject1.setAuthorOneToMany(author);

		SubjectOneToMany subject2 = new SubjectOneToMany();
		subject2.setName("History");
		subject2.setAuthorOneToMany(author);

		SubjectOneToMany subject3 = new SubjectOneToMany();
		subject3.setName("Science");
		subject3.setAuthorOneToMany(author);

		subjectSet.add(subject1);
		subjectSet.add(subject2);
		subjectSet.add(subject3);

		author.setSubjects(subjectSet);

		authorOneToManyRepository.save(author);

	}

	@Test
	void createAuthorManyToManyTest() {

		Address address1 = new Address();
		address1.setLocation("New Delhi");
		address1.setState("Delhi");
		address1.setStreetNumber("90");

//		Address address2= new Address();
//		address2.setLocation("Noida");
//		address2.setState("UP");
//		address2.setStreetNumber("77");


		AuthorManyToMany author1 = new AuthorManyToMany();
		author1.setName("AUTHOR1");
		author1.setAddress(address1);


//		AuthorManyToMany author2 = new AuthorManyToMany();
//		author2.setName("AUTHOR2");
//		author2.setAddress(address2);


//		AuthorManyToMany author3 = new AuthorManyToMany();
//		author2.setName("AUTHOR3");
//		author2.setAddress(address2);

		List<BookManyToMany> booksForAuthor1 = new ArrayList<>();

		BookManyToMany b1 = new BookManyToMany();
		b1.setBookName("ABC");

		//bookManyToManyRepository.save(b1);

		booksForAuthor1.add(b1);

//		BookManyToMany b2= new BookManyToMany();
//		b2.setBookName("DEF");

//		List<AuthorManyToMany> authorsForBook1 = new ArrayList<>();
		//	List<AuthorManyToMany> authorsForBook2 = new ArrayList<>();


//		List<BookManyToMany> booksForAuthor2 = new ArrayList<>();
//		List<BookManyToMany> booksForAuthor3 = new ArrayList<>();

//		authorsForBook1.add(author1);

//		authorsForBook2.add(author2);
//		authorsForBook2.add(author3);

//		b1.setAuthorManyToManyList(authorsForBook1);


		//	booksForAuthor1.add(b2);

//		booksForAuthor2.add(b2);
//
//		booksForAuthor3.add(b2);


		author1.setBooks(booksForAuthor1);
//		author2.setBooks(booksForAuthor2);
//		author3.setBooks(booksForAuthor3);

		//	b1.setAuthorManyToManyList(authorsForBook1);
		//b2.setAuthorManyToManyList(authorsForBook2);


		authorManyToManyRepository.save(author1);

	}

	@Test
	void createAuthorOneToOneTest() {

		Address address1 = new Address();
		address1.setLocation("New Delhi");
		address1.setState("Delhi");
		address1.setStreetNumber("90");

		AuthorOneToOne authorOneToOne = new AuthorOneToOne();

		authorOneToOne.setName("Author1");
		authorOneToOne.setAddress(address1);


		BookOneToOne bookOneToOne = new BookOneToOne();
		bookOneToOne.setBookName("BOOKX");

		authorOneToOne.setBookOneToOne(bookOneToOne);

		authorOneToOneRepository.save(authorOneToOne);

	}

}
