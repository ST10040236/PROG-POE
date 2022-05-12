/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanbanregister;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginUnitTestTest 
{
    
    public LoginUnitTestTest()
    {}
    
    LoginUnitTest kbLogin = new LoginUnitTest();

    @Test
    public void testCorrectUsernameFormat() 
    {
        boolean username = kbLogin.usernameFormat("kyl_1"); //correct username format = true
                assertTrue(username);
    }
    
    @Test
    public void testIncorrectUsernameFormat() 
    {
         boolean username = kbLogin.usernameFormat("kyle!!!!!!!"); //incorrect = false
                assertFalse(username);
    }
    
    @Test
    public void testCorrectPasswordComplexity() 
    {
         boolean password = kbLogin.passwordComplexity("“Ch&&sec@ke99!"); //password meets criteria = true
                assertTrue(password);
    }
    
    @Test
    public void testIncorrectPasswordComplexity() 
    {
         boolean password = kbLogin.passwordComplexity("password"); //does not meet criteria = false
                assertFalse(password);
    }
    
}
