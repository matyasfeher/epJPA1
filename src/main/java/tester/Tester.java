/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import facade.facade;
import javax.persistence.Persistence;

/**
 *
 * @author Acer
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persistence.generateSchema("pu", null);
        facade f = new facade();
        f.createUser("matyas", "fehermatyas178@gmail.com");
        f.createUser("matyas2", "fehermatyas177@gmail.com");
        f.createUser("matyas3", "fehermatyas176@gmail.com");
        f.createUser("matyas4", "fehermatyas175@gmail.com");
        f.createUser("matyas5", "fehermatyas174@gmail.com");
        f.createUser("matyas6", "fehermatyas173@gmail.com");
        f.createUser("matyas7", "fehermatyas172@gmail.com");
        f.createUser("matyas8", "fehermatyas171@gmail.com");
        f.createProject("Study Point Exercise", "Please do a lot of OOM!");
        f.findUser(3);
        //f.findAllUsers();
        
    }
}
