/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a8_static_variable;

/**
 *
 * @author MADARA
 */
public class University {
      static String university="JU";
    
    String name;
    int id;
    
    University(String name,int id ){
    this.name=name;
    this.id=id;
        
    }
    
    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(university);
    }
    
    
}
