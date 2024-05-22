/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peliculas;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.internal.util.config.ConfigurationException;

/**
 *
 * @author IanGz
 * 
 */
public class Peliculas {

    public static void main(String[] args) {
        
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();

            Scanner scan = new Scanner(System.in);

            System.out.println("Introduce o nome da pelicula:");
            String title = scan.nextLine();
            System.out.println("Introduce o ano de publicacion");
            String year = scan.nextLine();
            
            session.beginTransaction();
            session.save(new Pelicula(title,year));
            session.getTransaction().commit();

            List result = session.createQuery("from Pelicula").list();
            for (Pelicula p : (List<Pelicula>) result) {
                
            }

            // Código que executa as operacións coa BD con Hibernate
            session.close();
            sessionFactory.close();

        } catch (ConfigurationException e) {
            System.out.println("Erro nas operacións coa base de datos: " + e.getMessage());
            // O registry e eliminado pola SessionFactory, pero se non podemos
            // creala, eliminamolo explicitamente
            StandardServiceRegistryBuilder.destroy(registry);
        }
        
        
        
        
        
        
    }
}
