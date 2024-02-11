/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a36_polymorphism_run_time;

/**
 *
 * @author MADARA
 */
public class Test {
    
    public static void main(String[] args) {
        
        person ob=new person("aziz",101);
        ob.display();
        
        
        ob=new Teacher("aziz",101,"Bsc in CSE");
        ob.display();
     

    }
    
    
}
