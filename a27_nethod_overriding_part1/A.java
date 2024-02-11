/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a27_nethod_overriding_part1;

/**
 *
 * @author MADARA
 */
public class A {
    
    String name;
    int age;
    
    void method1(String name,int age){
        this.name=name;
        this.age=age;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    
    /*final void display(){
        System.out.println(name);
        System.out.println(age);
    }
    static void display(){
        System.out.println(name);
        System.out.println(age);
    }
    
    */
    
}
