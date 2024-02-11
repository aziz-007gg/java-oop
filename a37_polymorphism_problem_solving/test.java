/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a37_polymorphism_problem_solving;

/**
 *
 * @author MADARA
 */
public class test {
    
    public static void main(String[] args) {
        
        shape shape=new shape();
        System.out.println(shape.area());
        
        shape=new rectangle(2.3,3.3);
        System.out.println(shape.area());
        
        shape=new triangle(2.2,4.5);
        System.out.println(shape.area());
        
        shape=new circle(4);
        System.out.println(shape.area());
    }
    
}
