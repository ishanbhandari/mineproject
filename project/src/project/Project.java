/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author macstudent
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employee e1=new employee();
        e1.setValues(1,"ishan",1000.21);
        e1.display();
        
        Arithmatic arithmatic = new Arithmatic();
        System.out.println(arithmatic.sum(10,100));
        System.out.println(arithmatic.sum(10,10));
        System.out.println(arithmatic.sum(10,10,32));
    }
    
}
