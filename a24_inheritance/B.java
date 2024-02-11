/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a24_inheritance;

/**
 *
 * @author MADARA
 */
public class B extends A {
    
    int age;
    
    void set2(String name,int id,int age){
        
       set(name,id);
       this.age=age;
       
       
    }
    void display2(){
        display();
        System.out.println(age);
    }
    }
    

    

