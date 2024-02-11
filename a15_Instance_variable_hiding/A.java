/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a15_Instance_variable_hiding;

/**
 *
 * @author MADARA
 */
public class A {
    String name;
    int id;
    
    
    A(String name,int id){
        this.name=name;
        this.id=id;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(id);
    }
}
