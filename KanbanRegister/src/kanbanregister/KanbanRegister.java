/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanbanregister;

import javax.swing.*;

public class KanbanRegister 
{ //References: Farrell, J. 2019. Java Programming. 9th ed. Boston: Cengage
    
    
    
// first time user registration
    
    public static void main(String[] args) 
    {
        String fName, surname, username, password;
        
        fName = JOptionPane.showInputDialog(null, 
               "Please enter your FIRST NAME", 
               "REGISTER NAME",
               JOptionPane.QUESTION_MESSAGE);
        ////objLogin.setFname(fName); for login later
        
        surname = JOptionPane.showInputDialog(null, 
               "Please enter your SURNAME", 
               "REGISTER SURNAME",
               JOptionPane.QUESTION_MESSAGE);
        //objLogin.setSurname(surname); for login later
        
        //username min max 5 characters, must have underscore
        username = JOptionPane.showInputDialog(null, 
               "Please create a new USERNAME", 
               "REGISTER USERNAME",
               JOptionPane.QUESTION_MESSAGE);
        //objLogin.setUsername(username); for login later
        
        //password min 8 characters, must have special characters
        password = JOptionPane.showInputDialog(null, 
               "Please create a new PASSWORD", 
               "REGISTER PASSWORD",
               JOptionPane.QUESTION_MESSAGE);
        //objLogin.setPassword(password); for login later
        
        //validation rules
        if(username.length() == 5 && username.matches(".*_.*")  //max 5 characters with underscore
                
                && password.length() >= 8 
                && password.matches(".*[0-9].*") 
                && password.matches(".*[`,~,!,@,#,$,%,^,&,*,_,-,+,=].*") //min 8 characters, capital, special and number must be included
                && password.matches(".*[A-Z].*") )
        {
            JOptionPane.showMessageDialog(null, 
                    "Account successfully created." + "\nWelcome, " + fName +" " + surname 
                            + ". Please remember your LOGIN DETAILS: " 
                            + "\nUSERNAME - " + username 
                            + "\nPASSWORD - " + password ); //message if successful
        }else
        {
             JOptionPane.showMessageDialog(null, 
                    "Account failed to be created. " + "Please ensure that the: " 
                            + "\nUSERNAME was correctly formatted - contains an underscore and is no more than 5 characters in length."
                            + "\nPASSWORD was correctly formatted - contains at least 8 characters, a capital letter, a number and a special character."); //message if error
        }
    }
    
}
