package org.example;

import org.example.entity.Animal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_zoo");
        EntityManager em = emf.createEntityManager();

//          Création des animaux
//        Animal animal =new Animal("Mistigris", 1, DietType.CARNIVORE, "2012-03-08");
//        Animal animal1= new Animal("Tigrou", 1, DietType.VEGAN, "2000-06-11");
//        Animal animal2 =new Animal("Ratatouille", 1, DietType.CARNIVORE, "2007-12-02");
//        em.getTransaction().begin();
//        em.persist(animal);
//        em.persist(animal1);
//        em.persist(animal2);
//        em.getTransaction().commit();

        // search by id
//        Animal animalFind1 = em.find(Animal.class,1);
//        Animal animalFind2 = em.find(Animal.class,2);
//        Animal animalFind3 = em.find(Animal.class,3);
//        if (animalFind1 != null) {
//            System.out.println(animalFind1);
//        }
//        if (animalFind2 != null) {
//            System.out.println(animalFind2);
//        }
//        if (animalFind3 != null) {
//            System.out.println(animalFind3);
//        }else{
//            System.out.println("Animal not found");
//        }

        // search by name
        TypedQuery<Animal> query = em.createQuery("select a from Animal a where a.name = Tigrou", Animal.class);

        List<Animal> animals = query.getResultList();
        for (Animal animal : animals) {
            System.out.println(animal);
        }






    }
}