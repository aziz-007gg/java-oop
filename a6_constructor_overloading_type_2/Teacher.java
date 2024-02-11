/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a6_constructor_overloading_type_2;

/**
 *
 * @author MADARA
 */
public class Teacher {
    
    String name;
    int id,age;
    
    
    Teacher(){
        System.out.println("I am deafault constructor");
    }
    
    Teacher(String name,int id){
        this.name=name;
        this.id=id;
        
    }
    
    Teacher(String name,int id,int age){
        
        this.name=name;
        this.id=id;
        this.age=age;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
    }
    
}
