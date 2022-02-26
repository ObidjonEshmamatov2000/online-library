package uz.star.february_exam_pdp.service.book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;
import uz.star.february_exam_pdp.entity.book.Book;
import uz.star.february_exam_pdp.entity.user.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    public Session getSession() {
        Configuration configuration =
                new Configuration().configure().
                        addAnnotatedClass(Book.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        return sessionFactory.openSession();
    }

    public boolean addBook(Book book) {
        Session session = getSession();

        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();

        session.close();
        return true;
    }

    public List<Book> getBookList() {
        Session session = getSession();
        List<Book> books = new ArrayList<>();
        Transaction transaction = session.beginTransaction();
        books = (List<Book>) session.createQuery("from Book", Book.class).list();
        transaction.commit();
        session.close();
        return books;
    }
}
