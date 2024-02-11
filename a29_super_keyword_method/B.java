/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a29_super_keyword_method;

/**
 *
 * @author MADARA
 */
public class B extends A {
    int age;
    
     void method2(String name,int id,int age){
        method(name,id);
        this.age=age;
       
    }
    void display(){
        super.display();
        System.out.println(age);
        
    }
    
}
