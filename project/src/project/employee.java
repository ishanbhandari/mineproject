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
public class employee {
    
    int id;
    String name;
    double salary;
    
    public void setValues(int empid,String empname, double sal)
    {
        this.id=empid;
        this.name=empname;
        this.salary=sal;
    }
           public void display()
           {
          System.out.format("%d %s %f",id,name,salary);
           
    }
    
}
