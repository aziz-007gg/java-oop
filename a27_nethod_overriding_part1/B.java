/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a27_nethod_overriding_part1;

/**
 *
 * @author MADARA
 */
public class B extends A{
    
    int id;
    
    void method2(String name,int age,int id){
        method1(name,age);
        this.id=id;
    }
    @Override
    void display(){
        super.display();
        System.out.println(id);
        
    }
    
}
