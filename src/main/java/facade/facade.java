/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entity.Project;
import entity.ProjectUser;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Acer
 */
public class facade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

    public void createUser(String userName, String email) {
        EntityManager em = emf.createEntityManager();
        Date date = new Date();
        date.getTime();
        ProjectUser p = new ProjectUser(userName, email, date);
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public String findUser(long id) {
        EntityManager em = emf.createEntityManager();
        String user;
        user = em.find(ProjectUser.class, id).toString();
        return user;
    }

    public List findAllUsers() {
        EntityManager em = emf.createEntityManager();
        List allUsers;
        return null;
    }

    public void createProject(String name, String description) {
        EntityManager em = emf.createEntityManager();
        Date created = new Date();
        Date lastModified = new Date();
        created.getTime();
        lastModified.getTime();
        Project p = new Project(name, description, created, lastModified);
        try {
            System.out.println(name);
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void assignUser2Project() {

    }

    public String findProject(String projectName) {
        EntityManager em = emf.createEntityManager();
        final String query = "SELECT name FROM PROJECT WHERE username = :" + projectName;
        Query q = em.createQuery(query);
        String project = q.getSingleResult().toString();
        return project;
    }

    public void createTaskandAssign2Project() {

    }

}
