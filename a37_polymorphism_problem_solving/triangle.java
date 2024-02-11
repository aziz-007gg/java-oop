/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a37_polymorphism_problem_solving;

/**
 *
 * @author MADARA
 */
public class triangle extends shape {
    
    double height,base;
    
    triangle(double height,double base){
        this.height=height;
        this.base=base;
    }
    
    double area(){
        return .5*height*base;
    }
    
}
