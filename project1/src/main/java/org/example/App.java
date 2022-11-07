package org.example;

import org.example.model.Director;
import org.example.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration1 = new Configuration().addAnnotatedClass(Director.class)
                .addAnnotatedClass(Movie.class);

        SessionFactory sessionFactory = configuration1.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

    }
}
