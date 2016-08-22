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

/**
 *
 * @author USER
 */
public class NewUserRequest_JUnitTest {
    
    public NewUserRequest_JUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        String username = "Admin2016";
        String password = "Dan@12345";
        String email = "badamasiyusuf611@gmail.com";
        String phone_number = "+601135227735";
        String name = "Badamasi";
        String lname = "Yusuf";
        String gender = "male";
        String nationality = "Malaysia";
        String address = "FTMS Cyberjaya";
        
        // user entry
        String pass, email1, phone;
        pass = "Dan@12345";
        email1 = "badamasiyusuf611@gmail.com";
        phone = "+601135227735";
        
        
        
        
        assertEquals(password, pass);
        assertEquals(email, email1);
        assertEquals(phone_number, phone);   
    }
}
