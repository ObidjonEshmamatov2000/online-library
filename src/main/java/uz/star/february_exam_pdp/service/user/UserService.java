package uz.star.february_exam_pdp.service.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;
import uz.star.february_exam_pdp.entity.user.User;
import uz.star.february_exam_pdp.entity.user.UserRoleEnum;

import java.util.List;

@Service
public class UserService {
    public boolean addUser(User user) {
        Session session = getSession();

        Transaction transaction = session.beginTransaction();
        List<User> list = session.createQuery("from User u where u.username = '" + user.getUsername() + "'", User.class).list();
        transaction.commit();
        if (list == null || list.size() == 0) {
            session.save(user);
            session.close();
            return true;
        }
        session.close();
        return false;
    }

    public User loginAsAdmin(String username, String password) {
        Session session = getSession();

        Transaction transaction = session.beginTransaction();
        List<User> list = session.createQuery("from User u where u.username = '" + username + "' and u.password = '" + password + "'", User.class).list();
        transaction.commit();
        if (list == null || list.size() == 0) return null;
        User user = list.get(0);
        if (user.getUserRoleEnum().equals(UserRoleEnum.ADMIN)) {
            session.close();
            return user;
        }

        session.close();
        return null;
    }

    public User loginAsUser(String username, String password) {
        Session session = getSession();

        Transaction transaction = session.beginTransaction();
        List<User> list = session.createQuery("from User u where u.username = '" + username + "' and u.password = '" + password + "'", User.class).list();
        transaction.commit();
        if (list == null || list.size() == 0) return null;
        User user = list.get(0);
        if (user.getUserRoleEnum().equals(UserRoleEnum.ADMIN)) {
            session.close();
            return null;
        }
        session.close();
        return user;
    }

    public Session getSession() {
        Configuration configuration =
                new Configuration().configure().
                        addAnnotatedClass(User.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        return sessionFactory.openSession();
    }
}
