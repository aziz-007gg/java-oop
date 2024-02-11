/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4_constructor;

/**
 *
 * @author MADARA
 */
public class Teacher {
    
    String name;
    int id;
    
    Teacher(String name,int id){
        this.name=name;
        this.id=id;
        
    }
    void method(){
        System.out.println(name);
        System.out.println(id);
    }
}
