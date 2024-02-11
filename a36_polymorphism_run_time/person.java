/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a36_polymorphism_run_time;

/**
 *
 * @author MADARA
 */
public class person {
    String name;
    int id;
 
    person(String name,int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
    }
}
