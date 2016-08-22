/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit_Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Login_JUnitTest {
    
    public Login_JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        // setting username, password and key
        String username = "admin2016";
        String password = "Bad12345@admin";
        String key = "Xe@12d";
        
         Login lg = new Login(username, password, key);
         
        //Get user entry
        String user = "min2016";
	String pass = "Abd12345@admin";
	String userkey = "xa@12d";
	
        //Test if username, password and key 
        //entered is equal to database entries
         assertEquals(username, user);
         assertEquals(password, pass);
         assertEquals(key, userkey);
         
         System.out.println("Successful");
    }
}//End of test class
