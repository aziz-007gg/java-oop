/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a32_this_keyword;

/**
 *
 * @author MADARA
 */
public class A {
    
    String name;
    int age;
    String hairColor;
    
    A(String name,int age){
        this.name=name;
        this.age=age;
        
    }
    
     A(String name,int age,String hairColor){
        this(name,age);
        this.hairColor=hairColor;
        
    }
     
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(hairColor);
    }
    
}
