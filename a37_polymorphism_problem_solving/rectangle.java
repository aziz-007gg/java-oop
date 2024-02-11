/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a37_polymorphism_problem_solving;

/**
 *
 * @author MADARA
 */
public class rectangle extends shape {
    
    double height,width;
    
    rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }
    
    double area(){
        return height*width;
    }
    
}
