package com.vam.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {
    static { 
        try { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
        } catch(Exception e) { 
            e.printStackTrace(); 
        } 
    } 
    
    @Test 
    public void testConnection() { 
    	// given, when, then 구조
    	
    	// given (준비)
    	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    	String id = "gonekng";
    	String password = "0070";
    	
    	// when (실행)
        try(Connection con = DriverManager.getConnection( 
                url, id, password)){ 
        
        // then (결과)
            System.out.println(con); 
        } catch (Exception e) { 
            fail(e.getMessage()); 
        } 
    
    }    

}
