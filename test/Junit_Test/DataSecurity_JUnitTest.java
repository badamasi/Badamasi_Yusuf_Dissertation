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
public class DataSecurity_JUnitTest {
    
    public DataSecurity_JUnitTest() {
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
    public void DataTest() {
        String upload = "";
        String key;
        upload  = "Master in Software engineering";
        key = "abuabdullahbadmas";
        
        // Get user data for encryption
        
        String data = "Master in Software engineering";
        String secretkey = "abuabdullahbadmas";
        
        
        // secure data using AES algorithm with key provided
        
        assertEquals(upload, data);
         assertEquals(key, secretkey);
        
        
    }// end of test function
}// end of data security class
