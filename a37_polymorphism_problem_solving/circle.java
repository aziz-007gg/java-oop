/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a37_polymorphism_problem_solving;

/**
 *
 * @author MADARA
 */
public class circle extends shape{
    
    double radius;
    
    circle(double radius){
        this.radius=radius;
    }
    
    double area(){
        return Math.PI*radius*radius;
    }
    
    
}
